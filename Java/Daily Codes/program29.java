abstract class Master{
	void aabhyas(){
		System.out.println("Ata AI alay");
	}
	abstract void job();
}
class Student extends Master{
	void job(){
		System.out.println("Lagel ka job ?");
	}
	void me(){
		System.out.println("Job ch tar nahi mahiti pn g--d tar nakki lagnare ");
	}
}
class Client{
	public static void main(String[] args){
		Student obj=new Student();
		obj.aabhyas();
		obj.job();
		obj.me();
	}
}
