public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java - cool!";
        String str2 = new String(str1);
        String str3 = "Java code is effective!";
        int rezult, idx;
        char ch;

        System.out.println(str1.length());
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));

        }
        System.out.println();
        System.out.println();
        //Сравниваем str 1 и str2
        if (str1.equals(str2)) System.out.println("OK");
        else System.out.println("Bad news");
        System.out.println();
        //Сравниваем str 1 и str3
        if (str1.equals(str3)) System.out.println("OK");
        else System.out.println("Bad news");

        System.out.println();
        rezult = str1.compareTo(str3);
        if (rezult == 0) System.out.println("OK");
        else if (rezult < 0) System.out.println("str1 < str 3");
        else if (rezult > 0) System.out.println("str1 > str 3");

        System.out.println();
        str2 = " One, Two, Three, One";
        idx = str2.indexOf("One");
        System.out.println(idx);
        idx = str2.lastIndexOf("One");
        System.out.println(idx);

    }

}

