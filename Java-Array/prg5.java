import java.util.*;
class prg5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Array elements");  
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }     
        int poscount=0;
        int negcount=0;
        int zerocount=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                poscount++;
            }
            else if(arr[i]<0){
                negcount++;
            }
            else{
                zerocount++;
            }
            System.out.println("Positive elements "+poscount);
            System.out.println("Negative elements "+negcount);
            System.out.println("Zero elements "+zerocount);

        }
    }
}