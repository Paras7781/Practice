import java.io.*;

class Divisible2510 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 2 == 0 && num % 5 == 0 && num % 10 == 0)
        {
            System.out.println(num + " is divisible by 2,5 and 10");
        }
        else
        {
            System.out.println(num + " Is Not Divisible By 2,5 and 10");
        }
    }
}
