import java.io.*;
class Demo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of rows ");
		int rows=Integer.parseInt(br.readLine());
		int arr[][]=new int[rows][];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter no of elements for "+ i + "th column");
			int col=Integer.parseInt(br.readLine());
			arr[i]=new int[col];
		}
		System.out.println("Enter elements ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
