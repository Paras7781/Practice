import java.io.*;

class CompareTen {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());

        if(num > 10)
        {
            System.out.println(num + " is greater than 10.");
        }
        else if(num < 10)
        {
            System.out.println(num + " is less than 10.");
        }
        else
        {
            System.out.println(num + " is equal to 10.");
        }
    }
}
