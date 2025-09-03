package Loop;
import java.util.Scanner;
public class W11_04_DoWhile_True_ChuooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // โจทย์ เขียนโปรอกรมเลือกเมนู
        // ถ้าเลือก 1 ให้บวกเลข 2 จำนวน
        // ถ้าเลือก 2 ให้ลบเลข 2 จำนวน
        // ถ้าเลือก 3 ให้ออกจากโปรแกรม
// ===========================================
// แสดงข้อความรับตัวเลข / จำนวน


// ===========================================
// แสดลเมนูเพื่อรับ choice
System.out.println("=============================");
System.out.println("Menu:");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Exit");
System.out.println("=============================");

int choice;
do { 
    // รับค่าเลือกเมนู
    System.out.println("------------------------------");
    System.out.print("Enter your Choice: ");
    choice = kb.nextInt();
    
    switch (choice) {
            case 1:
                System.out.print("Enter Number1: ");
                int num1 = kb.nextInt();
                System.out.print("Enter number2: ");
                int num2 = kb.nextInt();

                int result = num1 + num2;
                System.out.println("Addition Result: "+result);
                break; // ออกจาก switch case
                
            case 2:
                System.out.print("Enter Number1: ");
                num1 = kb.nextInt();
                System.out.print("Enter number2: ");
                num2 = kb.nextInt();

                System.out.println("Subtraction Result: "+ (num1 - num2));
                break; // ออกจาก switch case
    
            case 3:
                System.out.println("Exitting the program. Goodbye!");
                break; // ออกจาก switch case
    
            default:
                System.out.println("Invalid choice. Please try again.");
            }

        }while (choice != 3);


        kb.close();
    }
}
