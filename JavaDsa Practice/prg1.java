import java.util.*;
class prg1{
    static int countfactor(int num){
        int count=0;
        for(int i=1;i<=num/i;i++){
            if(num%i==0){
                if(num/i==i){
                    count++;
                }
                else{
                    count+=2;
                }
            }
        }
        return count;
    }
    static String Primecheck(int num){
        if(countfactor(num)==2){
            return "Prime Number";
        }
        else{
            return "Not Prime Number";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int result=countfactor(num);
        System.out.println(Primecheck(result));
    }
}