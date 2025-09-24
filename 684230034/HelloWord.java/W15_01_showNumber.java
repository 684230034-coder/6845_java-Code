package Arrays;
public class W15_01_showNumber {
    public static void main(String[] args) {
        int num [] = new int [100];
        for (int i=0 ;i<num.length ; i++){
            num[i] = i+24;
            System.out.println("index [" + i + "]= " + num[i]);

        }




        int x = num[49];




        System.out.println("=======================");
        System.out.println("num at index = " + num[24]);
        System.out.println("num at end no.50 = " + num[99]);
    }
}