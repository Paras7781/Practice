import java.io.*;

class FoodDelivery{
	String cust_name;
	String addr;
	FoodDelivery(String cust_name,String addr){
		this.cust_name=cust_name;
		this.addr=addr;
	}
	void showCustomer(){
		System.out.println("Customer Name : "+cust_name);
		System.out.println("Address : "+addr);
	}
}
class OrderFood extends FoodDelivery{
	OrderFood(String cust_name,String addr){
		super(cust_name,addr);
	}
	void PlaceOrder(){
		System.out.println("Order placed successfully for : "+cust_name);
		System.out.println("Your order is reaching at : "+addr);
	}
}
class Client{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name : ");
		String name=br.readLine();
		System.out.println("Enter ur addr : ");
		String addr=br.readLine();

		OrderFood obj=new OrderFood(name,addr);
		obj.showCustomer();
		obj.PlaceOrder();
	}
}

