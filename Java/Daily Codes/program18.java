import java.io.*;

class TaxCalculator{
    static void calculateTax(double sal){
        System.out.println("Entered Salary : " + sal);
        double tax = sal * 0.10;   
        System.out.println("Tax Amount (10%) : " + tax);
        double remainingSal = sal - tax;
 	System.out.println("Remaining Salary After Tax : " + remainingSal);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(br.readLine());
        calculateTax(salary);
    }
}
