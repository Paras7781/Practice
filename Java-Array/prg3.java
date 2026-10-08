import java.util.*;
class prg3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }      
        int max=arr[1];
        int min=arr[2];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum element "+max);
        System.out.println("Minimum element "+min);
    }
}