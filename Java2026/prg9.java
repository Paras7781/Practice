import java.util.*;
class prg9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name ");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter course name[Java/Python/C++]");
        String course = sc.next();
        System.out.println("Enter exam fee");
        double examFee = sc.nextDouble();
        if(age<18){
            System.out.println("Age must be at least 18");
        }
        else if(examFee<=0){
            System.out.println("Exam fee must be greater than 0");
        }
        else{
            double finalAmount = examFee;
            if(examFee>=5000){
                finalAmount = examFee - (examFee*0.1);
            }
            System.out.println("Registration details:");
            System.out.println("Student name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course name: " + course);
            System.out.println("Final payable amount: " + finalAmount);
        }
        sc.close();
    }
}