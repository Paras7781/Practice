import java.io.*;

class DivisibleBy7 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 7 == 0)
        {
            System.out.println("Divisible by 7");
        }
        else
        {
            System.out.println("Not divisible by 7");
        }
    }
}
