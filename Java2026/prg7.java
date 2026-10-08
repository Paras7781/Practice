import java.util.Scanner;
class prg7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name ");
        String name=sc.nextLine();
        System.out.println("enter total working days " );
        int workingDays=sc.nextInt();
        System.out.println("enter days present ");
        int daysPresent=sc.nextInt();
        double bonus = 0;
        double attendancePercentage = (double) daysPresent / workingDays * 100;
        System.out.println(attendancePercentage + "%");
        if (attendancePercentage > 90) {
            bonus = 5000;
            System.out.println("Excellent");
        } else if (attendancePercentage > 75) {
            bonus = 3000;
            System.out.println("Good");
        } else if (attendancePercentage > 60) {
            bonus = 1000;
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
        System.out.println("Bonus: " + bonus);
        sc.close();
    }
}