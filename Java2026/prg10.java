import java.util.*;
class prg10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bus type (ordinary/semi luxury/luxury/sleeper): ");
        String busType = sc.nextLine();
        System.out.println("Enter number of passengers: ");
        int numPassengers = sc.nextInt();
        double totalFare = 0;
        switch(busType) {
            case "ordinary":
                totalFare = numPassengers * 200;
                break;
            case "semi luxury":
                totalFare = numPassengers * 350;
                break;
            case "luxury":
                totalFare = numPassengers * 500;
                break;
            case "sleeper":
                totalFare = numPassengers * 800;
                break;
            default:
                System.out.println("Invalid bus type");
        }
        if(numPassengers > 4) {
            totalFare = totalFare - (totalFare * 0.1);
        }
        System.out.println("Total fare: " + totalFare);
        sc.close();
    }
}