import java.util.Scanner;

    public class Input3Line {
    
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        int int1 = num.nextInt();
        num.nextLine();

        double double1 = num.nextDouble();
        num.nextLine();
        
        String String1 = num.nextLine();

        num.close();

        System.out.println("String: " + String1);
        System.out.println("Double: " + double1);
        System.out.println("Int: " + int1);

    }
}