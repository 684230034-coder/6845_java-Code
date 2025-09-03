import java.util.Scanner;
public class W07_02_square_root {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // input: prompt the user for a number
        System.out.print("Enter a number to find its square root: "); // แสดงค่าของ x ที่ต้องการจะกรอก
        double number = kb.nextDouble(); // รับค่า x จากผู้ใช่ด้วยคีบอร์ด

        // Process: calculate the spuare root of the number
        if(number > 0) {
        double spuareRoot = Math.sqrt(number);
         // Output the square root of the number
        System.out.println("Spuare root of "+ number + " is "+ Math.sqrt(number));

        } else {
            System.out.println("Error: The number must be positive.");
        }

        }
    }

