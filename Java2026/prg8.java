import java.util.*;
class prg8{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter student name ");
        String name = sc.nextLine();
        System.out.println("Enter book name ");
        String book = sc.nextLine();
        System.out.println("Enter number of days the book is overdue ");
        int daysOverdue = sc.nextInt();
        double fine = 0;
        if(daysOverdue == 0){
            fine = 0;
        }
        else if(daysOverdue>0 && daysOverdue<=5){
            fine = daysOverdue * 2;
        }
        else if(daysOverdue>5 && daysOverdue<=10){
            fine = daysOverdue * 5;
        }
        else if(daysOverdue>10){
            fine = daysOverdue * 10;
        }
        System.out.println("The fine for the overdue book is: " + fine);
        sc.close();
    }
}