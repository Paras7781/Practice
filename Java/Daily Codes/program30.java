interface A{
	public static void fun(){
		System.out.println("Hello");
	}
}
interface B{
	public static void fun(){
		System.out.println("World");
	}
}
class Client extends Object implements A,B{
	public static void main(String[] args){
		Client obj=new Client();
		obj.fun();
		//obj.fun();
	}
}
