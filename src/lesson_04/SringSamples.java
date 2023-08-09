package lesson_04;

public class SringSamples {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(str);

        String str1 = new String("Java2");// ispolsuem kanstruktor

        String str2 = new String();
        String str3 = "";
        System.out.println(str3);

        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(str4);

        String str5 = "Hello, World!";
        int length = str5.length();
        System.out.println( str5 + " length:" + length);

    }
}
