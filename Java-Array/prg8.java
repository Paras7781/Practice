import java.util.*;
class prg8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                count++;
            }
        }
        System.out.println("Count ="+count);
    }
}