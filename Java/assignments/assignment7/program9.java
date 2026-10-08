import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int cube=i*i*i;
			System.out.print(cube+" ");
			i++;
		}
		System.out.println();
	}
}
