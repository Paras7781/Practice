class StringMethods
{
    public static void main(String args[])
    {
        String str = "paras chougule";

        System.out.println("Original String : " + str);

        // 1. trim()
        String s1 = "   paras chougule   ";
        System.out.println("\nTrim : " + s1.trim());

        // 2. replace()
        String replaced = str.replace('a','A');
        System.out.println("Replaced a To A : " + replaced);

        // 3. contains()
        boolean check = str.contains("paras");
        System.out.println("Contains 'paras' : " + check);

        // 4. split()
        String words[] = str.split(" ");
        System.out.println("\nSplit words :");
        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]);
        }

        // 5. join()
        String joined = String.join("-", "paras", "chougule", "java");
        System.out.println("\nJoin : " + joined);

        // 6. concat()
        String concat = str.concat(" student");
        System.out.println("Concat : " + concat);

        // 7. substring()
        String sub = str.substring(0,5);
        System.out.println("Substring (0,5) : " + sub);

        // 8. identityHashCode()
        System.out.println(System.identityHashCode(str));
    }
}
