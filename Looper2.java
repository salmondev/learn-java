import java.util.Scanner;

public class Looper2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        int r;

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            r = a;
            for (int j = 0, k = 0; j < n && k <= n-1; j++, k++) {
                // r = (a + (2^k * b)) + r;
                r = (int) ((Math.pow(2, k) * b) + r);
                System.out.print(r + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}