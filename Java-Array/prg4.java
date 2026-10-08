import java.util.*;
class prg4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }      
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                count++;
            }
        }
        int odd=arr.length-count;
        System.out.println("Even elements "+count);
        System.out.println("Odd elements "+odd);

    }
}