import java.util.*;
class prg4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name ");
        String name=sc.nextLine();
        System.out.println("Enter employee id ");
        int id=sc.nextInt();
        System.out.println("Enter basic salary ");
        double sal=sc.nextDouble();
        double hra=sal*0.2;
        double da=sal*0.15;
        double pf=sal*0.12;
        double net_salary=(sal+hra+da)-pf;
        if(net_salary>50000){
            net_salary=net_salary-200;
        }
        System.out.println("Net salary: "+net_salary);
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Basic salary: "+sal);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("PF: "+pf);
    }
}