package java_marathon.src.primitivetypes;

public class Casting {
    public static void main(String[] args) {
        int register = (int) 10000000000L;
        System.out.println("Register : " + register);

        double dollar = 100.00;
        float euro = (float) dollar;
        System.out.println("Dollar : " + euro);
    }
}
