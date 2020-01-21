package mvc;

//import mvc.Controller;

public class App {
    public static void main(String[] args) {
        Model mo = new Model();
        mo.setName("java name");
        String moName = mo.getName();

        int data[] = {10, 20, 30, 40, 50};

        int sumData = Controller.sumValue(data);

        System.out.println(moName);
        System.out.println(sumData);
    }
}