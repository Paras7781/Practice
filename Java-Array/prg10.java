import java.util.*;
class prg10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array 1 elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Array 2 elements");
        int arr2[]=new int[size];
        for (int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        boolean same=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr2[i]){
                same=true;
            }
            else{
                same=false;
            }
        }
        if(same==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}