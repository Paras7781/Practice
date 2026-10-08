import java.io.*;

class EnsureCapacityExample {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter string: ");
        String str = br.readLine();

        StringBuffer sb = new StringBuffer(str);

        System.out.println("Current capacity: " + sb.capacity());

        sb.ensureCapacity(100);

        System.out.println("New capacity: " + sb.capacity());
    }
}
