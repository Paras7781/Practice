import java.util.*;
class prg6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }    
        System.out.println("Enter number to be search ");
        int key=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Element at index "+i);
                break;
            }
            else{
                flag=false;
            }
        }
        if(flag==false){
            System.out.println("Element not found ");
        }
    }
}