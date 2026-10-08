import java.util.*;
class prg9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int size2=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array 1 elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[size2];
        System.out.println("Enter Array 2 elements");  
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[arr.length+arr2.length];
        System.out.println("Merged array");
        for(int i=0;i<arr.length;i++){
            arr3[i]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr.length+i]=arr2[i];
        }
        for(int i=0;i<arr3.length;i++){
        System.out.println(arr3[i]);
        }
    }
}