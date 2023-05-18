public class StringArrays {
    public static void main(String[] args) {
        String[] strs = {"Эта", "строка", "является", "текстом."};
        System.out.println("Массив: ");
        for (String str : strs) System.out.print(str + " ");
        System.out.println("\n");
        strs[2] = "так же является";
        strs[3] = "текстом!";
        System.out.println("Измененный массив: ");
        for (String str : strs) System.out.print(str + " ");

        System.out.println();
        String s1 = "Hello";
        String s2 = s1;
        String s3 = "Hell";
        boolean bool = s1 == s2;
        int num = s3.compareTo(s1);

        System.out.println(bool + " \n" + num);
    }
}
