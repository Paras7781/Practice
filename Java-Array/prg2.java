import java.util.*;
class prg2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements");
        int sum=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int avg=(sum/arr.length);
        System.out.println(sum);
        System.out.println(avg);
    }
}