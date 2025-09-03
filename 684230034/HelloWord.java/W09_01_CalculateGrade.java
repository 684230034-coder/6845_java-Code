import java.util.Scanner;
public class W09_01_CalculateGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // รับค่าคะแนน
        // เปรียบเทียบคะแนนเป็นเกรดต่างๆ
        // เกณฑ์คะแนนและเกรด
        // A = 80
        // B = 70
        // C = 60
        // B = 50
        // F = 0-49

        System.out.print("Score: ");
        int score = kb.nextInt();

        if(score < 0 || score > 100){
            System.out.println("Erore score");
        }else {
            if(score >= 80){
                System.out.println("Grade A");
            }else if (score >= 70) {
                System.out.println("Grade B");
            }else if (score >= 60) {
                System.out.println("Grade C");
            }else if (score >= 50) {
                System.out.println("Grade D");
            }else {
                System.out.println("Grade F");
            }
        }
        kb.close();
    }
}