package Loop;
import java.util.Scanner;
public class W12_01_For_Sumnumber {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

            System.out.print("Enter a Start number:");
            int start = kb.nextInt();
            System.out.print("Enter a Stop number:");
            int stop = kb.nextInt();
            
        while(start >= stop){
            System.out.println("Start number must be less than Stop.");
            System.out.print("Enter a start number:");
            start = kb.nextInt();
            System.out.print("Enter a Stop number:");
            stop = kb.nextInt();
        }
        int sum = 0;
        int count = 1;

        for (int  i = start  ; i<=stop  ; i += 1 ) {
            System.out.println("รอบที่"+ count++ +": "+ sum + " + "+ i +" = "+(sum+i));
        }
    }
}



