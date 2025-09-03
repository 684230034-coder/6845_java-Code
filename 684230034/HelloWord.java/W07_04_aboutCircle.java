import java.util.Scanner;
public class W07_04_aboutCircle {
    public static void main(String[] args) {
        // ต้องการให้ผู้ใช้เลือกว่าจะคำนวณอะไรเกี่ยวกับวงกลม : เส้นรอบวง หรือ พื้นที่
        // สิ่งที่ต้องรับเข้ามาเกี่ยวกับวงกลมคือ รัศมี (radius)
        // เส้นรอบวง = 2 * pi * r
        // พื้นที่ = pi * r^2

final double PI = 3.14; //ค่าคงที่ของ Pi

Scanner scanner = new Scanner(System.in);

System.out.print("กรุณาใส่รัศมี: ");
double radius = scanner.nextDouble();

System.out.println("เลือกการคำนวณเกี่ยวข้องกับวงกลม");
System.out.println("1.พื้นที่");
System.out.println("2.เส้นรอบวง");
System.out.print("กรุณาเลือก(1 หรือ 2): ");

int choice = scanner.nextInt();

if(choice==1) {
System.out.println("พื้นที่: "+PI*radius*radius);

}else{
    System.out.println("เส้นรอบวง: " +2*PI*radius);
}
scanner.close();
    }
}
    

