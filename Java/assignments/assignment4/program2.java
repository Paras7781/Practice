import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		if(num>=1 && num<=1000){
			System.out.println(num+" is in the range of 1 to 1000");
		}
		else{
			System.out.println(num+" is not in the range of 1 to 1000 ");
		}
	}
}
