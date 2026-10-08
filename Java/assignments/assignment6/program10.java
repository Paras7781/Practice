import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start value");
		int start=sc.nextInt();
		System.out.println("Enter end value");
		int end=sc.nextInt();
		int sum=0;
		while(start<=end){
			if(start%2!=0){
				sum+=start;
			}
			start++;
		}
		System.out.println(sum);
	}
}
