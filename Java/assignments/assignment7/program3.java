import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter no of elements:")
		for(int i=0;i<=n;i++){
			if(i%2==0){
				System.out.print(i+",");
			}
		}
		System.out.println();
	}
}
