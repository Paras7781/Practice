import java.io.*;

class CareerSuggestion {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter percentage: ");
        double percentage = Double.parseDouble(br.readLine());

        if(percentage > 85)
        {
            System.out.println("Medical");
        }
        else if(percentage <= 85 && percentage > 75)
        {
            System.out.println("Engineering");
        }
        else if(percentage <= 75 && percentage >= 65)
        {
            System.out.println("Pharmacy or Bachelor in Science");
        }
        else
        {
            System.out.println("Other field");
        }
    }
}
