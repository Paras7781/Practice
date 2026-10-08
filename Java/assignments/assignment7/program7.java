import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start range ");
		int start=sc.nextInt();
		System.out.println("Enter end range");
		int end=sc.nextInt();
		int i=start;
		while(i<=end){
			if(i%4==0 || i%7==0){
				System.out.println(i+" ");
			}
			i++;
		}

	}
}
