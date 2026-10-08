import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day: ");
		int day=sc.nextInt();
		while(day>=0){
			if(day==0){
				System.out.println("0 days assignment is overdue");
			}
			else{
				System.out.println(day+"days of assignment remaining");
			}
			day--;
		}
	}
}
