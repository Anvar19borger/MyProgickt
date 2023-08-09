
package lesson_06;

public class StringEquais {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a == b);

        String str1 = "Java 9";
        String str2 = "Java 9";
        String str3 = new String("JAVA 9");

        boolean b1 = str1 == str2;
        System.out.println(b1);

        System.out.println(str1);
        System.out.println(str3);

        boolean b2 = str1 == str3;
        System.out.println("str1 == str3 " + b2);

        boolean b3 = str1.equals(str3);
        System.out.println("str1.equals(str3) " + b3);
        boolean b4 = str1.equalsIgnoreCase(str3);
        System.out.println("str1.equalsIgnoreCase(str3) " + b4);

        {

        }

    }
}