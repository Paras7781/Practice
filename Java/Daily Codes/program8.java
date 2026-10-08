import java.io.*;

class TrimToSizeExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        String str = br.readLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println("Capacity before trim: " + sb.capacity());

        sb.trimToSize();

        System.out.println("Capacity after trim: " + sb.capacity());
    }
}
