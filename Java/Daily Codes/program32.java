class Demo extends Thread{
	Demo(String msg){
		super(msg);
	}
	public void run(){
		try{	
			//Client.mainThread.join();
			for(int i=0;i<10;i++){
				System.out.println(getName() +" - "+ i);	
				Client.mainThread.join();
			}	
		}catch(InterruptedException e){
		
		}
	}
}
class Client{
	static Thread mainThread=null;
	public static void main(String[] args){
		mainThread=Thread.currentThread();
		Demo t1=new Demo("C2W");
		t1.start();
		try{
			//t1.join();
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName() +" - "+ i);
				t1.join();
			}
		}catch(InterruptedException e){
		
		}
	
	}
}
