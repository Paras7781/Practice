import java.io.*;
class prg5{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name ");
        String name=br.readLine();
        System.out.println("Enter age ");
        int age=Integer.parseInt(br.readLine());
        System.out.println("Enter monthly income ");
        double income=Double.parseDouble(br.readLine());
        System.out.println("Enter cibil score ");
        int cibil=Integer.parseInt(br.readLine());
        System.out.println("Enter existing loan(yes/no) ");
        String loan=br.readLine();
        if(age>=21){
            if(income>=30000){
                if(cibil>=750){
                    if(loan.equals("no")){
                        System.out.println("Eligible for loan");
                    }
                    else{
                        System.out.println("criteria not fulfilled");
                        System.out.println("Not Eligible");
                    }
                }
            }
        }
    }
}