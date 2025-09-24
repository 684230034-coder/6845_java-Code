package Arrays;
import java.util.Scanner;
public class W15_02_sumNumber {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        double a [] = new double [5];

        for(int i=0 ; i<a.length ; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            a[i] = kb.nextDouble();
            System.out.println("=============================" );
        }
        
        double sumAll = 0; // sum all numbers
        double sumOdd = 0; // sum odd numbers
        double sumEven = 0; // sum even numbers
        double average = 0; // average of all numbers
        double max = a[0]; // max number
        double min = a[0]; // min number

        // show all numbers
        System.out.println("Show all number : ");
        for(int i=0 ;i<a.length ; i++){
            System.out.println("imdex [" + i + "] value = " + a[i]);
            sumAll += a[i];
            if(a[i] % 2 != 0) {
                sumOdd += a[i];
            } else {
                sumEven += a[i];
            }

            // find max number
            if(a[i] > max){
                max = a[i];
            }

            // find min number
            if(a[i] < min) {
                min =a[i];
            }
        }
            System.out.println("=============================" );
            System.out.println("Sum of All number = " + sumAll);
            System.out.println("Sum of Odd number = " + sumOdd);
            System.out.println("Sum of Even number = " + sumEven);
            System.out.println("Max number = " + max);
            System.out.println("Min number = " + min);
            
            average = sumAll / a.length;
            System.out.println("Average of all numbers = " + average );

        kb.close();
    }
}
