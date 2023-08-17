package matimatiks;

public class IntedgerNum {
    public static void main(String[] args) {
        String name;
        name = "Andreas";
        int age;
        age = 38;
        double height;
        height = 1.87;
        String line = "Menja sawut " + name + " , mne " + age + "  let, moi rost - "
                + height;

        System.out.println(line);


      System.out.println();

        char a = 'A';// peremennaja budit sodergat angl. bukvu A
        char b = 0x41; // peremennaja budit sodergat angl. bukwu A ,
        char c = 65;

        System.out.println(a + " b:" + b + " c: " + c);

        String name3;
        name3 = "Andreas1";
        System.out.println();
        System.out.println(name3);
        System.out.println();

 String str1;
 str1 ="Andreas";
 String str2;
 str2 ="Borger";
 String str3;
 str3 ="Ich";
 String str4;
 str4 ="bin";
 String str5;
 str5 ="AIT";
 String str6;
 str6 = "Schuler!";
 System.out.println(str1 +" " + str2 +" ,"+ str3 +" " + str4 + " " + str5 + " " + str6);


 String str = " Java";
 System.out.println(str);
 int length = name.length();
 System.out.println(name + " length: " + length);


  str6 = str1.concat(str);
 System.out.println(str6);
 str1 = str5 + " " + str3;
 System.out.println(str1);

 str6 = String.join( " ", str1, str2, str4);
 System.out.println(str6);

 String strNumbers ="01234567";
 System.out.println("length " + strNumbers.length());
 char firstChar = strNumbers.charAt(0);
 System.out.println("firstChar " + firstChar);
 char lastChar = strNumbers.charAt(strNumbers.length() -1);
 System.out.println("lastChar " + lastChar);

 String substring =strNumbers.substring(2);
 System.out.println(strNumbers);
 System.out.println("substring " + substring);



    }
}
