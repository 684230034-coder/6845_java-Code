import java.util.Scanner;
public class W07_03_OddEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // input
        System.out.print("รับค่าข้อมูลจากผู้ใช่: ");
        int n = kb.nextInt();

        // Process : สูตรคำนวณเลขคู่และเลขคี่
        if (n%2 == 0 ) { // เอาตัวแปรที่รับเข้ามาไปหารด้วย2
        // Output : แสดงผลลัพธ์
            System.out.println("number " + n + " is even");
        } else {
            System.out.println("number " + n + " is odd");
        }
    }
}