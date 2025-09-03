import java.util.Scanner; // import Scanner เข้ามา

public class W06_01_Coin { // ประกาศชื่อคลาส
    public static void main(String[] args) { // สร้าง Method
        Scanner kb = new Scanner(System.in); // สร้างอ็อบเจกต์ Scanner เพื่อรับข้อมูลจากผู้ใช้

        // รับจำนวนเงินบาทจากผู้ใช้
        System.out.print("Enter amount in Baht:"); //แสดงข้อความให้ผู้ใช้ป้อนจำนวนเงินที่ต้องการแยก
        int baht = kb.nextInt(); // รับค่าเงินบาทจากผู้ใช้ด้วยคีย์บอร์ดตัวเลขจำนวนเต็ม

        // คำนวณจำนวนเหรียญ
        int Coin10 = baht / 10; // การหารจำนวนบาทด้วย 10
        baht = baht % 10; // คำนวณเศษจากการหาร 10 
        int Coin5 = baht / 5;// การหารจำนวนบาทด้วย 5
        baht = baht % 5; // คำนวณเศษจากการหาร 5 
        int Coin1 = baht; // 

        // แสดงผลลัพธ์
        System.out.println("10Baht coin: " + Coin10); 
        System.out.println("5Baht coin: " + Coin5);
        System.out.println("1Baht coin: "+ Coin1);
        kb.close(); // ปิดScanner

    }
}