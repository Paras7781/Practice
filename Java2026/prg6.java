import java.util.Scanner;
class prg6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer value ");
        int value=sc.nextInt();

        if (value>0) {
            System.out.println("Positive number");
        }
        else if(value<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }

        if(value%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

        if(value%2==0 && value%8==0){
            System.out.println("Divisible by 2 and 8");
        }
        else{
            System.out.println("Not divisible by 2 and 8");
        }
        int count = 0;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        int sum=0;
        while (value != 0) {
            int digit = value % 10;
            sum = sum + digit;
            value = value / 10;
        }

        System.out.println("Sum of digits = " + sum);

    }
}