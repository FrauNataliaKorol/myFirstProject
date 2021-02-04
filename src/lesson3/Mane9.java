package lesson3;

public class Mane9 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println(i);
                break;

            }
        }

    }
}
