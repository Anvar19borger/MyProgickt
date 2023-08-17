package matimatiks;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        boolean boll = true;
        boolean boll1 = false;
        boolean b1 = (a == b);

        System.out.println(b1);
        System.out.println(a == b);


        boolean b2 = a != b;
        System.out.println(b2);// true
        System.out.println(b != 10);//false

        boolean b3 = a > b;
        boolean b4 = a < b;
        boolean b5 = b > 10;
        System.out.println("b3 " + b3 + " b4: " + b4 + " b5: " + b5);

        boolean b6 = a >= b;
        boolean b7 = a <= b;
        boolean b8 = b >= 10;
        System.out.println("b6 " + b6 + " b7: " + b7 + " b8: " + b8);

        System.out.println();
        System.out.println("=============================");

        boolean bol = !(2 > 5);
        System.out.println(bol);
        System.out.println(!true);
        boolean var = 3 != 4;
        var = !(3 != 4);
        System.out.println("var " + var);
        System.out.println(!(3 != 4));

        System.out.println();
        System.out.println("***********************************");

        boolean var1 = true & false;
        System.out.println(var1);
        var1 = (2 < 5) & (10 != 11);
        System.out.println(var1);
        var1 = (2 < 5) & (10 == 11);
        System.out.println(var1);

        // logicheskoe ili |
        boolean var2 = true | false;
        System.out.println("var2 " + var2);
        var2 = (2 < 5) | (10 == 11);
        System.out.println(var2);


        int x = 1;
        int y = 5;
        boolean b9 = (y / x > 24);
        System.out.println("b9 " + b9);

        System.out.println("++++++++++++++++++++++++++++++++");

        boolean aa = true;
        boolean bb = false;
        int c = 25;
        int qq = 2;
        System.out.println((aa | bb) | (c < 100) & !(true) ^ (qq == 5));
        System.out.println((aa | bb) | (c < 100) & false ^ (qq == 5));
        System.out.println((aa | bb) | false ^ (qq == 5));
        System.out.println((aa | bb) | false);
        System.out.println(true | false);
        System.out.println(true);

          /*
        !
        &
        ^
        |
        &&
        ||
         */


    }
}
