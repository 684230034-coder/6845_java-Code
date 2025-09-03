import java.util.Scanner;
public class W03_01_Area_Triangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); // สร้างอ็อบเจกต์ Scanner เพื่อรับข้อมูลจากผู้ใช้
        
        // input base and height of triangle
        System.out.print("Enter Base = "); // แสดงข้อความให้ผู้ใช้ป้อนฐานของรูปสามเหลี่ยม
        int base = kb.nextInt(); // รับค่าฐานจากผู้ใช้ที่กรอกผ่านคีย์บอร์ดเป็นตัวเลขจำนวนเต็ม
        System.out.print("Enter Height = ");
        int height = kb.nextInt();
        
        // Calculate area teiangle
        double area = 0.5* base* height; // หรือใส่ชนิดข้อมูลเป็น float ก็ได้
        System.out.print("Area of triangle = " + area);
        kb.close(); 
    }
}