package lesson_03;

public class Task01 {
    public static void main(String[] args) {
        int var0 = 0 ;
        int var1 = 1 ;
        int var2 = 2 ;
        int var3 = 3 ;
        int var4 = 4 ;
        int var5 = 5 ;
        int var6 = 6 ;
        int var7 = 7 ;
        int var8 = 8 ;
        int var9 = 9 ;

        int sum =  var0 + var1 +  var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9;                                                                    ;
        System.out.println(sum);

        int average = sum / 10;

        System.out.println(average);

        int rest = sum % 10;
        System.out.println(rest);

        double drobRest =((double) sum / 10) - sum / 10;
        System.out.println(drobRest);

        double drobRest2 = (double) rest /10;
        System.out.println(drobRest2);
    }
}
