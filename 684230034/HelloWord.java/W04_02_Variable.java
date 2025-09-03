import java.util.Scanner;

public class W04_02_Variable {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // ประกาศตัวแปรและชนิดข้อมูล
        byte a;
        byte b;
        // กำหนดค่าให้กับตัวแปร
        a= 10; // กำหนดค่า 10 ให้กับตัวแปร a
        b= 20; // กำหนดค่า 20 ให้กับตัวแปร b
        // เราสามารถรวมตัวแปรที่ประกาศไว้แล้วให้อยู่บรรทัดเดียวกันได้
        // ประกาศตัวแปร a และ b เป็นชนิดข้อมูล byte
        byte aa, bb; // ประกาศตัวแปร a และ b เป็นชนิดข้อมูล byte
        byte aaa = 0, bbb = 0; // ประกาศตัวแปร a และ b เป็นชนิดข้อมูล byte และกำหนดค่าเป็น 0

        // ประกาศตัวแปรและชนิดข้อมูล พร้อมกับกำหนดค่า
        short c = 30 ; // กำหนดค่า 30 ให้กับตัวแปร c

        int ch = '\u0044'; // กำหนดค่า 68 (ASCII จอง 'D') ให้กับตัวแปร ch
        System.out.println(ch);

        String ch1 = "\u0044";
        System.out.println(ch1);

        String ch2 = "\u0044";
        System.out.println(ch2);

        int var1 = 014;
        System.out.println(var1);

        float var2 = 014f;
        System.out.println(var2);

        double var4 = 0E-0;
        System.out.println(var4);

        String var9 = null;
        System.out.println(var9);

        boolean var10 = true;
        System.out.println(var10);

        boolean var11 = 2>3;
        System.out.println(var11);





    }
}
