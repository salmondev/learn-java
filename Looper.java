import java.util.Scanner;

public class Looper {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int r = 0;

        for (int i = 1; i <= 10; i++) {
            r = n * i;
            System.out.println(n + " x " + i + " = " + r);
        }
    }
}