class ParkingLot {

    int availableSlots = 2;

    synchronized void park(String carName) {

        try {

            while (availableSlots == 0) {

                System.out.println(carName + " is waiting for a parking slot...");

                wait();
            }

            availableSlots--;

            System.out.println(carName + " parked.");

            System.out.println("Available Slots : " + availableSlots);

        } catch (InterruptedException e) {
         
        }
    }

    
    synchronized void leave(String carName) {

        availableSlots++;

        System.out.println(carName + " left the parking.");

        System.out.println("Available Slots : " + availableSlots);

        notify();
    }
}

class Car extends Thread {

    ParkingLot parkLot;
    String name;

    Car(ParkingLot parkLot, String name) {
        this.parkLot = parkLot;
        this.name = name;
    }

    public void run() {

        parkLot.park(name);

        try {
            Thread.sleep(5000);     
        } catch (InterruptedException e) {
        
	}

        parkLot.leave(name);
    }
}

class Client {

    public static void main(String[] args) throws InterruptedException {

        ParkingLot parking = new ParkingLot();

        Car c1 = new Car(parking, "Car A");
        Car c2 = new Car(parking, "Car B");
        Car c3 = new Car(parking, "Car C");
        Car c4 = new Car(parking, "Car D");

        c1.start();
	Thread.sleep(1000);
        c2.start();
	Thread.sleep(1000);
        c3.start();
	Thread.sleep(1000);
        c4.start();
    }
}
