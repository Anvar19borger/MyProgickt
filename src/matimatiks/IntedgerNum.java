package matimatiks;

public class IntedgerNum {
    public static void main(String[] args) {
        System.out.println("Mathematics");

        int x = 20;
        int y = 10;

        int z = x - y; // = - eto preswoenie, a ne "rawenstwo", kak bilo w schkole

        System.out.println(" z = x - y : " + z); // w kowichkach - eto tekstovoe oformlenie, soprowogdenie

        z = x * y;

        System.out.println(" z = x * y : " + z);

        int a = 57;
        int b = 10;

        // delenie celich chisel
        int c = a / b;

        System.out.println("Chastnoe  " + a + " / " + b + " = " + c );// celochislinnoe delenie

        int d = a % b;

        System.out.println("Chastnoe  " + a + " % " + b + " = " + d );// celochislinnoe delinie s ostatkom

        int n = 60 % 12;// ostatok ot delenija
        System.out.println("60 % 12 = " + n);


        System.out.println("========= weschestwinnie chisla =========");

        double f = 10.0D;
        double g = 9.8;
        double e = f / g;
        System.out.println("Resultat " + f + " / " + g + " = " + e);

        //formotiriwannii wiwod
        System.out.printf("Resultat: %.2f ", e);

        //preobrosowanie tipov
        int num1 = 10;
        int num2 = 3;

        double d1 = (double) num1 /(double) num2;// preobrosowanie int w tip double
        System.out.println();
        System.out.println(d1);

        int num3 = (int) d1;// prreobrosowanie tipa
        System.out.println(num3);

        System.out.println("======= metodi klassa Math. ========");

        double r = 10;
        double length = 2 * Math.PI * r;// dlina okrugnasti
        System.out.println("Legth of circle is : "+ length);

        double area = Math.PI * Math.pow(r, 2); // PI * r w kwodrate - ploschad kruga
        System.out.println(" Aria of circle is :" + area);

        System.out.printf("=== inkriment i dekrement");
        int i = 0;


        ++i;// uwelichenie na 1

        System.out.printf(" i = " + i);

        i++;// uwelichenie na 1

        System.out.printf(" i = " + i);



        // += ,-=,*=, /= - prowesti eksperimenti, chto poluchitsja . Prochitat w stotjach.




    }
}
