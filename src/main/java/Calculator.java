public class Calculator {
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Il secondo numero non può essere 0");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) {
        return num1 *num2;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
