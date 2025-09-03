package Loop;
import java.util.Scanner;
public class W11_03_While_True_ChuooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // โจทย์ เขียนโปรอกรมเลือกเมนู
        // ถ้าเลือก 1 ให้บวกเลข 2 จำนวน
        // ถ้าเลือก 2 ให้ลบเลข 2 จำนวน
        // ถ้าเลือก 3 ให้ออกจากโปรแกรม
// ===========================================
// แสดงข้อความรับตัวเลข / จำนวน
System.out.print("Enter Number1: ");
int num1 = kb.nextInt();
System.out.print("Enter number2: ");
int num2 = kb.nextInt();


// ===========================================
// แสดลเมนูเพื่อรับ choice
        System.out.println("=============================");
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("=============================");

        while (true) {
            // รับค่าเลือกเมนู
            System.out.print("Enter your Choice: ");
            int choice = kb.nextInt();
            System.out.println("------------------------------");

            switch (choice) {
                case 1:
                    System.out.println("Addition Result: "+ (num1 + num2));
                    break; // ออกจากลูป
                
                case 2:
                    System.out.println("Subtraction Result: "+ (num1 - num2));
                    break; // ออกจากลูป

                case 3:
                    System.out.println("Exitting the program. Goodbye!");
                    break; // ออกจากลูป

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break; // ออกจากลูป
            }
            if (choice == 1) {
                break;
            }else if (choice == 2) {
                break;
            }else if (choice == 3) {
                break;
            }else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
