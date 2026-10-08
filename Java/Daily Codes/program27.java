abstract class Demo{
	void fun(){
		System.out.println("Hello");
	}
	abstract void marry();
}
class Child extends Demo{
	void marry(){
		System.out.println("World");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Child();
		obj.fun();
		obj.marry();
	}
}
