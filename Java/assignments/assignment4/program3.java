import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch>=97 && ch<=122){
			System.out.println(ch+" is a lower case ");
		}
		else if(ch>=65 && ch<=90){
			System.out.println(ch+" is a upper case");
		}
		else{
			System.out.println(ch+" is not a char");
		}
	}
}
