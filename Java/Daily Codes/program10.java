import java.io.*;

class CharAtExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        String str = br.readLine();

        System.out.print("Enter index: ");
        int index = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer(str);

        System.out.println("Character: " + sb.charAt(index));
    }
}
