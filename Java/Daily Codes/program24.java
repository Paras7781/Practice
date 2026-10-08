import java.util.*;

class Numbers {

    void evenNumber(int s,int e){
        System.out.println("Even Numbers:");
        for(int i=s;i<=e;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }

    void oddNumber(int s,int e){
        System.out.println("Odd Numbers:");
        for(int i=s;i<=e;i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }

    void factorNum(int s,int e,int num){
        System.out.println("Factors of "+num+" between "+s+" & "+e);
        for(int i=s;i<=e;i++){
            if(num%i==0)
                System.out.println(i);
        }
    }

    void primeNumber(int s,int e){
        System.out.println("Prime Numbers:");
        for(int i=s;i<=e;i++){

            if(i<=1) continue;

            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }

            if(count==2)
                System.out.println(i);
        }
    }

    void evenSum(int s,int e){
        int sum=0;
        for(int i=s;i<=e;i++){
            if(i%2==0)
                sum+=i;
        }
        System.out.println("Sum = "+sum);
    }

    void reverseNumber(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("Reverse = "+rev);
    }

    void palindrome(int n){
        int rev=0,temp=n;

        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }

        if(rev==temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    void harshad(int n){
        int sum=0,temp=n;

        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }

        if(sum!=0 && temp%sum==0)
            System.out.println("Harshad");
        else
            System.out.println("Not Harshad");
    }

    void neon(int num){
        int sq=num*num;
        int sum=0;

        while(sq>0){
            int rem=sq%10;
            sum+=rem;
            sq/=10;
        }

        if(sum==num)
            System.out.println("Neon");
        else
            System.out.println("Not Neon");
    }

    void perfect(int num){
        int sum=0;

        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }

        if(sum==num)
            System.out.println("Perfect");
        else if(sum>num)
            System.out.println("Abundant");
        else
            System.out.println("Deficient");
    }

    void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;

        System.out.println("Factorial = "+fact);
    }

    void strongNumber(int n){
        int temp=n,sum=0;

        while(n>0){
            int rem=n%10;

            int fact=1;
            for(int i=1;i<=rem;i++)
                fact*=i;

            sum+=fact;
            n/=10;
        }

        if(sum==temp)
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }

    void digitSeparate(int n){
        System.out.print("Digits: ");
        while(n>0){
            System.out.print(n%10+" ");
            n/=10;
        }
        System.out.println();
    }
}

class NumbersMain {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Numbers N=new Numbers();

        System.out.print("Enter start: ");
        int start=sc.nextInt();

        System.out.print("Enter end: ");
        int end=sc.nextInt();

        do{
            System.out.println("\n1.Even  \n2.Odd  \n3.Factors  \n4.Prime");
            System.out.println("5.Factorial  \n6.Strong  \n7.Digits");
            System.out.println("8.SumEven  \n9.Reverse  \n10.Palindrome");
            System.out.println("11.Harshad  \n12.Neon  \n13.Perfect  \n0.Exit");

            int ch=sc.nextInt();

            switch(ch){

                case 1: N.evenNumber(start,end); 
			break;
                case 2: N.oddNumber(start,end); 
			break;
                case 3: System.out.print("Enter number: ");
                        N.factorNum(start,end,sc.nextInt());
                        break;
                case 4: N.primeNumber(start,end); 
			break;
                case 5: System.out.print("Enter number: ");
                    	N.factorial(sc.nextInt());
                    	break;
                case 6: System.out.print("Enter number: ");
                    	N.strongNumber(sc.nextInt());
                    	break;
                case 7: System.out.print("Enter number: ");
                    	N.digitSeparate(sc.nextInt());
                    	break;
                case 8: N.evenSum(start,end); 
			break;
                case 9: System.out.print("Enter number: ");
                    	N.reverseNumber(sc.nextInt());
                    	break;
                case 10:System.out.print("Enter number: ");
                    	N.palindrome(sc.nextInt());
                    	break;
                case 11:System.out.print("Enter number: ");
                    	N.harshad(sc.nextInt());
                    	break;
                case 12:System.out.print("Enter number: ");
                    	N.neon(sc.nextInt());
                    	break;

                case 13:System.out.print("Enter number: ");
                    	N.perfect(sc.nextInt());
                    	break;
                case 0: System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }

        }while(true);
    }
}
