import java.io.*;

class EvenOdd {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 2 == 0)
        {
            System.out.println(num + " is an even number");
        }
        else
        {
            System.out.println(num + " is an odd number");
        }
    }
}
