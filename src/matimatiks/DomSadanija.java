package matimatiks;

import java.util.Random;

public class DomSadanija {
    public static void main(String[] args) {

        Random random = new Random();
        int var1 = random.nextInt(20);
        int var2 = random.nextInt(20);
        int var3 = random.nextInt(20);
        int var4 = random.nextInt(20);
        int var5 = random.nextInt(20);
        int var6 = random.nextInt(20);
        int var7 = random.nextInt(20);
        int var8 = random.nextInt(20);

        System.out.println(checkNamber(var1));
        System.out.println(checkNamber(var2));
        System.out.println(checkNamber(var3));
        System.out.println(checkNamber(var4));
        System.out.println(checkNamber(var5));
        System.out.println(checkNamber(var6));
        System.out.println(checkNamber(var7));
        System.out.println(checkNamber(var8));
        System.out.println(checkNamber(0));


    }

    public static String checkNamber(int x) {
        boolean b1 = (x != 0) && (x % 2 == 0);
        boolean b2 = (x != 0) && (x % 3 == 0);
        boolean b3 = b1 && b2;
        String resultString = " Chislo: " + x + " chotnoe: " + b1 + " , kratno 3: " + b2 + ". chotnoe i kratnoe 3: " + b3;

        return resultString;
    }
}
