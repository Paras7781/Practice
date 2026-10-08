import java.util.Scanner;

class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i%3==1)
                    System.out.print("# ");
                else if(i%3==2)
                    System.out.print("@ ");
                else
                    System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
