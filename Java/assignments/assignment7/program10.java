import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range from ");
		int start=sc.nextInt();
		System.out.println("Enter range to ");
		int end=sc.nextInt();
		int i=start;
		while(i<=end){
			if(i%4==0 && i%5==0){
				System.out.println(i+" ");
			}
			i++;
		}
	}
}
