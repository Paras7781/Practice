import java.util.*;
class Employee{
	String name;
	double sal;
	void setDetails(String n, double s){
		name=n;
		sal=s;
	}	
	void displayDetails(){
		System.out.println("Employee Name : "+name);
		System.out.println("Employee sal : "+sal);
	}
	static void calculateBonus(double salary){
		double bonus = salary * 0.10;
        	System.out.println("Bonus salary : "+bonus);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee();
		System.out.println("Enter employee name : ");
		String name=sc.nextLine();
		System.out.println("Enter employee salary : ");
		double sal=sc.nextDouble();
		obj.setDetails(name,sal);
		obj.displayDetails();
		obj.calculateBonus(sal);
	}	
}
