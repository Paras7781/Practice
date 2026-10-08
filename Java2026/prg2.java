import java.util.*;

class prg2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pin = 4353;
        double balance = 15665.00;
        if(pin == 4353){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Invalid Pin");
        }
        do{
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance is "+balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    double deposit=sc.nextDouble();
                    balance+=deposit;
                    System.out.println("Your new balance is "+balance);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw");
                    double withdraw=sc.nextDouble();
                    if(withdraw>balance){
                        System.out.println("Insufficient balance");
                    }
                    else{
                        balance-=withdraw;
                        System.out.println("Your new balance is "+balance);
                    }
                    break;
                case 4:
                    System.out.println("Enter your new PIN");  
                    int newPin=sc.nextInt();
                    pin=newPin;
                    System.out.println("Your PIN has been changed successfully");
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);    
    }
}