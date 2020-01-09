import javax.swing.JOptionPane;
import java.util.Arrays;

public class Lab6_2 {
    public static void main(String[] args) {
        int score[] = new int[10];
        String output = "";
        for (int n = 0; n < score.length; n++) {
            score[n] = rnd(100, 500);
        }
        for (int n = 0; n < score.length; n++) {
            output += "Score " + (n + 1) + " : " + score[n] + "\n";
            output += "Minimum value is " + getMin(score) + "\n";
            output += "Maximum value is " + getMax(score) + "\n";
            output += "Average value is " + getAverage(score) + "\n";
            JOptionPane.showMessageDialog(null, output, "Display Score in Array", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static int getMin(int data[]) {
        int result;
        Arrays.sort(data);
        result = data[0];
        return result;
    }

    public static int getMax(int data[]) {
        int result;
        Arrays.sort(data);
        result = data[data.length - 1];
        return result;
    }

    public static int getAverage(int data[]) {
        int result;
        int sum = Arrays.stream(data).sum();
        result = sum / data.length;
        return result;
    }

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }
}