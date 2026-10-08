import java.io.*;

class DivisibleBy3Or7 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 3 == 0)
        {
            System.out.println(num + " is divisible by 3");
        }
        else if(num % 7 == 0)
        {
            System.out.println(num + " is divisible by 7");
        }
        else
        {
            System.out.println(num + " is neither divisible by 3 nor by 7.");
        }
    }
}
