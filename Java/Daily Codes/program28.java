class Hello{
	StringBuffer fun(){
		System.out.println("World");
		return new StringBuffer();
	}
}
class World extends Hello{
	String fun(){
		System.out.println("Paras");
		return new String("Paru");
	}
}
class Client{
	public static void main(String[] args){
		Hello obj=new World();
		obj.fun();
	}
}
