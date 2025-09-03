package Loop;
import java.util.Scanner;
public class W12_02_Sumnumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int start, stop;
        do{
            System.out.print("Enter a start number:");
            start = kb.nextInt();
            System.out.print("Enter a Stop number:");
            stop = kb.nextInt();

            int sum = 0;
            int count = 1;

            if (true) {
                for (int  i = start  ; i<=stop  ; i++ ) {
                    System.out.println("รอบที่"+ count++ +": "+ sum + " + "+ i +" = "+(sum+i));
                }
            }else{
                System.out.println("Start number must be less than Stop.");
            }
        }while(start >= stop);
        kb.close();
    }
}
