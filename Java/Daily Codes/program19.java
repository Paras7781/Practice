import java.util.*;
class Interest{
	void calculateSI(double p, double r, double t){
		
		double simple_Interest = (p*r*t)/100;
		System.out.println("Simple Interest : "+simple_Interest);
	}
	static void displayDetails(double p, double r, double t){
		System.out.println("Princple : "+p);
		System.out.println("Rate : "+r);
		System.out.println("Time : "+t);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle value : ");
		double p=sc.nextDouble();
		System.out.println("Enter rate value : ");
		double r=sc.nextDouble();
		System.out.println("Enter time : ");
		double t=sc.nextDouble();
		Interest obj=new Interest();
		obj.calculateSI(p,r,t);
		obj.displayDetails(p,r,t);
	}
}
