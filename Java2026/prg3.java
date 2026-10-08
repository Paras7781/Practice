import java.util.*;
class prg3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer name ");
        String cust_name=sc.nextLine();
        System.out.println("Enter units consumed ");
        int unit=sc.nextInt();
        int total=0;
        if(unit>0 && unit<=100){
            System.out.println("Customer name: "+cust_name);
            System.out.println("Units consumed: "+unit);
            total=unit*5;
            System.out.println("total amount = "+total);
        }
        else if(unit>100 && unit<=200){
            System.out.println("Customer name: "+cust_name);
            System.out.println("Units consumed: "+unit);
            total=unit*7;
            System.out.println("total amount = "+total);
        }
        else{
            System.out.println("Customer name: "+cust_name);
            System.out.println("Units consumed: "+unit);
            total=unit*10;
            System.out.println("total amount = "+total);
        }
        double gst=(total*1.18);
        System.out.println("final amount with gst "+gst);
        double discount;
        double final_amount;
        if(total>5000){
            discount=(gst*0.05);
            final_amount=gst-discount;
            System.out.println("final amount after discount "+final_amount);
        }
        sc.close();
    }
}