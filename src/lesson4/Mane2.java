package lesson4;

import java.util.Scanner;

public class Mane2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут?");
        String inputName = scanner.next();
        System.out.printf("Приятно познакомиться, %s", inputName );
        System.out.println("Сколько тебе лет?");
        int inputAge = scanner.nextInt();
        if(inputAge < 10){
            System.out.println("Да ты еще совсем ребенок");
        }else if ( inputAge > 10 &&inputAge < 20) {
            System.out.println( "Интересно, учишься в школе?");
        } else if (inputAge > 20 && inputAge < 40){
            System.out.println("Мне практически столько");
        }else {
            System.out.println("Что-то устала");
        }

    }

}
