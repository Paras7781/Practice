class StringMethodsDemo
{
    public static void main(String args[])
    {
        String str = "paras chougule";

        System.out.println("Original String : " + str);

        // StringBuffer object
        StringBuffer sb = new StringBuffer("paras chougule");

        // 1 Append
        sb.append(" java");
        System.out.println("\nAppend : " + sb);

        // 2 TrimToSize
        System.out.println("Capacity before trimToSize : " + sb.capacity());
        sb.trimToSize();
        System.out.println("Capacity after trimToSize : " + sb.capacity());

        // 3 Length
        System.out.println("\nLength : " + sb.length());

        // 4 charAt
        System.out.println("Character at index 2 : " + sb.charAt(2));

        // 5 ensureCapacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity : " + sb.capacity());

        // 6 delete
        StringBuffer sb2 = new StringBuffer("paras chougule");
        sb2.delete(5, 9);
        System.out.println("\nDelete characters (5,9) : " + sb2);

        // 7 replace
        StringBuffer sb3 = new StringBuffer("paras chougule");
        sb3.replace(6, 14, "chougule1");
        System.out.println("Replace : " + sb3);

        // 8 insert
        StringBuffer sb4 = new StringBuffer("paras chougule");
        sb4.insert(5, " paras2");
        System.out.println("Insert : " + sb4);

        // 9 reverse
        StringBuffer sb5 = new StringBuffer("paras chougule");
        sb5.reverse();
        System.out.println("Reverse : " + sb5);

        // 10 toString
        String converted = sb5.toString();
        System.out.println("toString : " + converted);

        // 11 indexOf
        System.out.println("IndexOf 'chougule' : " + sb.indexOf("chougule"));

        // 12 lastIndexOf
        System.out.println("LastIndexOf 'a' : " + sb.lastIndexOf("a"));
	}
   }
