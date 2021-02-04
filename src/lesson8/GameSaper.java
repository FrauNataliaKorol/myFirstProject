package lesson8;

public class GameSaper {

    public static void main(String[] args) {
        char[][] field = InitSaper.createField();
        String level = InitSaper.getGameLevel();
        InitSaper.fillMines(field,level);
        InitSaper.printGameField(field);

        System.out.println(args);
    }
}
