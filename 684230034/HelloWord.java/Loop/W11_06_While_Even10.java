package Loop;

public class W11_06_While_Even10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int count = 2 ;count <= 20 ;count = count + 2) {

            sum = sum + count;
            
            if (count < 20) {
                System.out.print(count+" + ");
            }else{
                System.out.print(count+" = "+sum);
            }
        }
    }
}
