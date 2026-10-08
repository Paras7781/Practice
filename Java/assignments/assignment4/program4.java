import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0 && num%5==0 && num%10==0){
			System.out.println(num+" is divisble by 2 5 10");
		}
		else{
			System.out.println(num+" is not divisble by 2 5 10");
		} 
	}
}
