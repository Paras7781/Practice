import java.util.*;

class prg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("Enter your rollno ");
        int roll = sc.nextInt();
        System.out.println("Enter your marks ");
        int marks[]= new int[5];
        int total=0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            if (marks[i] <= 0 || marks[i] > 100) {
                System.out.println("Invalid marks plz enter again");
                break;
            }
            total+=marks[i];
        }
        
        System.out.println("Total="+total);
        double percent=((total/500.0)*100);
        System.out.println("Percentage="+percent);
        if(percent>=90){
            System.out.println("Grade A");
        }
        else if(percent>=80 && percent<90){
            System.out.println("Grade B");
        }
        else if(percent>=70 && percent<80){
            System.out.println("Grade C");
        }
        else if(percent>=60 && percent<70){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        int count=0;
        for(int i=0;i<5;i++){
            if(marks[i]<35){
              count++;
            }
        }
        if(count==2){
            System.out.println("You are failed");
        }
        sc.close();
    }
}