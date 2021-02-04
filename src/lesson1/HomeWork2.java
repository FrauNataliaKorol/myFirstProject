package lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int a1 = 5;
        int b1 = 5;

        int square = a * b;
        int square1 = a1 * b1;

        int freePlace = square % square1;
        int inRoom = square/square1;

        System.out.println(freePlace);
        System.out.println(square);
        System.out.println(square1);
        System.out.println(inRoom);
    }


}
