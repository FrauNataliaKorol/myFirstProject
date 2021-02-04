package lesson4;

import java.util.Scanner;

public class Mane3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приумайте и введите пароль:");

        String password = scanner.next();

        if (password.length() < 8){
            System.out.println("Этот пароль слишком легкий!!");

        }
        if (password.contains("!") || password.contains("^") || password.contains("5") || password.contains("@")){
            System.out.println("Пароль средней сложности!");
        }
    }
}
