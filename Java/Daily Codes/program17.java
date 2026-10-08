class Company{
	String role="FrontEnd";
	static String project="Hospital Management System";
	public static void main(String[] args){
		Company obj = new Company();
		System.out.println("Role : "+obj.role);
		System.out.println("Main Project : "+obj.project);
		Company obj2 = new Company();
		obj2.role="BackEnd";
		obj2.project="Bank Management ";
		System.out.println("Role didnt changed in obj1 : "+obj.role);
		System.out.println("Main Project Changed in both objects : "+obj.project);
		System.out.println("Old Role Updated in obj2 From FrontEnd To : "+obj2.role);
		System.out.println("Main Project Changed in both objects : "+obj2.project);
	}
}
