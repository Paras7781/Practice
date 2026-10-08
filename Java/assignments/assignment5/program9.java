import java.io.*;

class VotingAge {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        if(age < 0)
        {
            System.out.println("Invalid age");
        }
        else if(age >= 18)
        {
            System.out.println("Valid age for voting");
        }
        else
        {
            System.out.println("Not eligible for voting");
        }
    }
}
