import java.time.Year;
import java.util.Scanner;

public class W09_03_StudentID {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter 9-digit Student ID: ");
        int studentID = kb.nextInt();

        // ดึงปีที่เข้าศึกษา (2 หลักแรกของรหัส)
        int startYear = studentID / 10000000;   // เช่น 684230001 -> 68

        // แปลงเป็นปี พ.ศ. 4 หลัก
        int startYearBE = 2500 + startYear;     // เช่น 68 -> 2568

        // หาเวลาปัจจุบันเป็นปี พ.ศ.
        int currentYearBE = Year.now().getValue() + 543;

        // คำนวณชั้นปี (ปีปัจจุบัน - ปีที่เข้า + 1)
        int yearLevel = currentYearBE - startYearBE + 1;

        // แสดงผลชั้นปีตามที่คำนวณได้
        if (yearLevel == 1) {
            System.out.println("1 (Freshmen)");
        } else if (yearLevel == 2) {
            System.out.println("2 (Sophomore)");
        } else if (yearLevel == 3) {
            System.out.println("3 (Junior)");
        } else if (yearLevel == 4) {
            System.out.println("4 (Senior)");
        } else {
            System.out.println(yearLevel + " (Beyond 4 years)");
        }

        kb.close();
    }
}

