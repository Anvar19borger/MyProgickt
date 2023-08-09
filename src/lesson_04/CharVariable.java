package lesson_04;

public class CharVariable {
    public static void main(String[] args) {
        char a = 'A'; // peremennaja budit soderjat angliskuju bukvu A
        char b = 0x41; // peremennaja budit soderjat angliskuju bukwu A
        char c = 65; // peremennaja budit soderjat angliskuju bukwu A
        b = 0x0041;
        char d = '\u0041';
        char e = '\u2019';


        System.out.println(a + " b:" + b +" c: " + c + " d: " + d);
        System.out.println(e);

        char ch = 'A';
        ch++; //ch = ch + 1;
        System.out.println(ch);

        ch = 97;
        ch += 2;
        System.out.println(ch);

        int x = 1;
        int y = 5;
        // x = x + y;
        x += y; // x = x + y;
        // *=, /=, -=, %=
        System.out.println(x);
        x %= y;
        System.out.println(x);
        char ch1 =12854;// wiwodit sinwol s tablici
        System.out.println(ch1);



    }
}
