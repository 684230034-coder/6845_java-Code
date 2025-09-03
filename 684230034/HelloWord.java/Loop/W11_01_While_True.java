package Loop;
import java.util.Scanner;
public class W11_01_While_True {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true) { 
// No.1 เขียนโปรแกรมรับตัวเลขจากคีบอร์ดไปเรื่อยๆ จนกระทั่งกดเบอร์ 9 จึงจะหยุด
            // System.out.print("Enter Number: ");
            // int num = kb.nextInt();
            
            // if(num == 9){ // คำสั่งที่ใช้ตรวจสอบการออกจากลูป
            //     break; // คำสั่งที่ใช้ในการออกจากลูป





// NO.2 เขียนโปรแกรมรับตัวอักษรจากคีบอร์ดไปเรื่อยๆ จนกระทั่งกดเบอร์ 'E' จึงจะหยุด
                System.out.print("Enter Alphabet: ");
                String alphabet = kb.nextLine();
                if(alphabet.equals("e"));{
                    break;
                }
            }
        }
    }

