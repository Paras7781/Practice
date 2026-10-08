import java.util.*;
class prg7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        } 
        int rev[]=new int[arr.length];
        for(int i=0;i<rev.length;i++){
            rev[i]=arr[arr.length-i-1];
        } 
        for(int i=0;i<rev.length;i++){
            System.out.println("Original array "+arr[i]);
            System.out.println("Reverse array "+rev[i]);
        }  
    }
}