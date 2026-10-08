class Demo{
	int x=10;
	static int y=20;
	Demo(){
		System.out.println("In Demo COnst");
	}
	Demo(int x){
		this();
		System.out.println("In Demo Arg Const");
		System.out.println(x);
	}
	void fun(){
		System.out.println("In Fun");
	}
	static void gun(){
		System.out.println("In gun");
	}
}
class Memo{
	public static void main(String[] args){
		System.out.println(Demo.y);
		Demo.gun();
		Demo obj=new Demo(15);
		System.out.println(obj.x);
		obj.fun();
	}
}
