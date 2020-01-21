import java.util.Scanner;

    public class In_out {
    
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();

        num.close();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}