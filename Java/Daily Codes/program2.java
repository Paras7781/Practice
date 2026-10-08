import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows=sc.nextInt();
		int num;
		for(int i=1;i<=rows;i++){
			num=1;
			for(int j=1;j<=rows;j++){
				System.out.print(num+"\t");
				num++;
			}
		System.out.println();
		}	
	}

}
