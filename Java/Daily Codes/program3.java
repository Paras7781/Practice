import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int col=sc.nextInt();
		for(int i=1;i<=rows;i++){
			if(i%2==1){
				for(int j=1;j<=col;j++){
					System.out.print("D"+j+" ");
				}
			}
			else{
				for(int j=col;j>=1;j--){
					System.out.print("C"+j+" ");
				}
			}
			System.out.println();
		}
	}
}
