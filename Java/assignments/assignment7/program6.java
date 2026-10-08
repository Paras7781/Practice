import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		int i=0;
		int num=100;
		while(i<n){
			System.out.println(num+" ");
			num++;
			i++;
		}
	}
}
