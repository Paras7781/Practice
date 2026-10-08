import java.io.*;

class AppendExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first string: ");
        String s1 = br.readLine();

        System.out.print("Enter second string: ");
        String s2 = br.readLine();

        StringBuffer sb = new StringBuffer(s1);
        sb.append(s2);

        System.out.println("After append: " + sb);
    }
}
