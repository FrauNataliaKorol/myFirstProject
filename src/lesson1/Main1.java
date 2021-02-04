package lesson1;

public class Main1 {
    public static void main(String[] args) {

        int money = 1000;
        int pizaCost = 450;
        int candyCost = 7;

        int totalPiza = money / pizaCost;
        int change = money % pizaCost;

        int totalCandy = change / candyCost;
        int changeAfterCandy = change % totalCandy;

        System.out.println("Всего купим пицц:" + totalPiza);
        System.out.println("Всего купим конфет:" + totalCandy);
        System.out.println("Сдача:" + changeAfterCandy);


    }
}
