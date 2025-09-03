import java.util.Scanner;
public class W03_02_proflie {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // สร้างอ็อบเจกต์ Scanner เพื่อรับข้อมูลจากผู้ใช้

        // input fristname lastname and age
        System.out.print("Enter You fristname"); // 
        String firstname = kb.next();
        System.out.print("Enter You lastname");
        String lastname = kb.next();
        System.out.print("Enter age");
        String age = kb.next();

        System.out.print("Hello you are = "+"NAME " + firstname+" "+ lastname+" AGE "+ age+"year");
        kb.close();
    }
}
