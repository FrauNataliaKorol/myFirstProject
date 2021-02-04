package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InitSaper {

    public static char[][] createField() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количество строк в сапере");
        int rows = scanner.nextInt();
        System.out.println("Введите количество колонок в игре");
        int cols = scanner.nextInt();
        char[][] field = new char[rows][cols];
        return field;

    }

    public static String getGameLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите уровень сложности");
        System.out.println("Введите слово слабый");
        System.out.println("Введите слово средний");
        System.out.println("Введите слово сложный");
        String level = scanner.next();
        return level;


    }

    public static void printGameField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "  ");


            }
            System.out.println();

        }

    }

    public static char[][] fillMines(char[][] field, String level) {
        int mines = 0;
        if (level.equalsIgnoreCase("Слабый")) {
            mines = field.length * field[0].length / 10;

        } else if (level.equalsIgnoreCase("Средний")) {
            mines = field.length * field[0].length / 5;

        } else {
            mines = (field.length * field.length) / 100 * 30;

        }
        for (int i = 0; i < mines; i++) {
          addMine(field);



        }
        return field;


    }
    private static  void addMine(char[][] field){
        int randomRow = ThreadLocalRandom.current().nextInt(0, field.length);
        int randomCol = ThreadLocalRandom.current().nextInt(0, field[0].length);
        if(field[randomCol][randomRow]!='*'){
            field[randomRow][randomCol] = '*';
        }else{
       addMine(field);

        }
    }

}

