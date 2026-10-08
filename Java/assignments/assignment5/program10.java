import java.io.*;

class StudentResult {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter percentage: ");
        double percent = Double.parseDouble(br.readLine());

        if(percent >= 75)
        {
            System.out.println("Passed : first class with distinction");
        }
        else if(percent >= 60)
        {
            System.out.println("Passed : first class");
        }
        else if(percent >= 50)
        {
            System.out.println("Passed : second class");
        }
        else if(percent >= 40)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
