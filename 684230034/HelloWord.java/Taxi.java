import java.util.Scanner;
public class Taxi {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("=============== INPUT ===============");

        System.out.print("Customer Name : ");
        String name = kb.nextLine();
        System.out.print("Units Consumed (kwh) : ");
        double Kwh = kb.nextDouble();
        System.out.print("Rate per Unit (Baht) : ");
        double Rate = kb.nextDouble();

        System.out.println("=============== OUTPUT ===============");

        Kwh = Kwh*Rate;
        double Baht = Kwh*7.5/100; 

        System.out.println("Customer Name : "+name);
        System.out.println("Kwh x Rate : " +Kwh);
        System.out.println("VAT 7.5% : "+Baht+ " Baht");

        System.out.println("--------------------------------------");

        double BILL = Kwh+Baht;

        System.out.println("TOTAL BILL : "+BILL+ " Baht");

        kb.close();

    }
}
