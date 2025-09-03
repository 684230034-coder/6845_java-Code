import java.util.Scanner;
public class W09_02_BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("น้ำหนักตัว (kg): ");
        double weight = kb.nextDouble();
        System.out.print("ส่วนสูง (m): ");
        double height = kb.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("You BMI is: "+String.format("%.2f")+ bmi);

        if(bmi > 40){
                System.out.println("อ้วนระดับ3");
            }else if (bmi >= 35) {
                System.out.println("อ้วนระดับ2");
            }else if (bmi >= 30) {
                System.out.println("อ้วนระดับ1");
            }else if (bmi >= 25) {
                System.out.println("น้ำหนักเกิน");
            }else if (bmi >= 18.5){
                System.out.println("น้ำหนักปกติ");
            }else {
                System.out.println("ต่ำกว่าเกณ(ผอม)");
            }
        kb.close();
    }
}



// สูตร คำนวณ BMI
// BMI = น้ำหนัก (กก.) / (ส่วนสูง (ม.) * ส่วนสูง (ม.))
