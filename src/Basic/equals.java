package Basic;

public class equals {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;

        int c = 10;
        int d = 10;

        String str1="abcd";
        String str2 = "abcd";

        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println(c==d);

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
