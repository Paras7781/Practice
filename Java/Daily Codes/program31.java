interface SujataMastani{
	public static void taste(){
		System.out.println("Taste cannot be changed");
	}
	void price();
}
class Mumbai extends Object implements SujataMastani{
	public void price(){
		System.out.println("120");
	}
}
class Baramati extends Object implements SujataMastani{
	public void price(){
		System.out.println("140");
	}
}
class Kolhapur extends Object implements SujataMastani{
	public void price(){
		System.out.println("160");
	}
}
class Client{
	public static void main(String[] args){
		SujataMastani obj=new Mumbai();
		SujataMastani.taste();
		obj.price();
		SujataMastani obj2=new Baramati();
		SujataMastani.taste();
		obj2.price();
		SujataMastani obj3=new Kolhapur();
		SujataMastani.taste();
		obj3.price();
	}
}

