import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            if (i % 2 != 0) {
                for (int j = rows; j >= 1; j--) {
                    System.out.print((char) ('A' + j - 1));
                }
            } else {
                for (int j = 1; j <= rows; j++) {
                    System.out.print((char) ('A' + j - 1));
                }
            }
            System.out.println();
        }
    }
}
