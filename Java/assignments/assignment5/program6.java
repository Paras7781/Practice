import java.io.*;

class MaximumNumber {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(br.readLine());

        if(num1 > num2)
        {
            System.out.println(num1 + " is maximum between " + num1 + "," + num2);
        }
        else
        {
            System.out.println(num2 + " is maximum between " + num1 + "," + num2);
        }
    }
}
