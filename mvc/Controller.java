package mvc;

public class Controller {

    public static int sumValue(int data[]) {
        
        int i;
        int sum = 0;
        for (i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }
}