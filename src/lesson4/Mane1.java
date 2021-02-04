package lesson4;

public class Mane1 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int generatorValue = 10;
        for (int i = 0; i < 10; i++) {
            numbers[i] = generatorValue;
            generatorValue = generatorValue + 2;
            System.out.println(numbers[i]);
        }
    }
}
