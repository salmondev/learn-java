public class Lab6_1 {

    public static void ThreeArray(int X[], int Y[], int Z[]){
        for (int i = 0; i < X.length; i++) {
            X[i] = i;
        }
        for (int i = 0; i < Z.length; i++) {
            Z[i] += X[i] * 5 + Y[i];    
        }
    }
    public static void main(String[] args) {
        int X[] = new int[10];
        int Y[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        final int Array_Size = 10;
        int Z[];

        Z = new int[Array_Size];

        ThreeArray(X,Y,Z);

        System.out.println("\tIndex \tArray X \tArray Y \tArray Z");
        for (int i = 0; i < X.length; i++) {
            System.out.print("\t" + X[i] + "\t\t" + X[i]);
            System.out.println("\t\t" + Y[i] + "\t\t" + Z[i]);
        }
    }
}