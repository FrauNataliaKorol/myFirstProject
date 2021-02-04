package lesson6;

public class StringUtils {
    /**
     * 1 - модификатор доступа ( одно из четырех слов )
     * public - доступ в любом месте внутри нашего проекта
     * protected - область видимости внутри текущего файла и его наследника
     * ___________ (package) - внутри пакета
     * private - внутри текущего файла
     * 2 - static (может быть или не быть)
     * 3- возврааемый тип (или слово void если его нет)
     * 4 - название метода (с маленькой буквы)
     * 5- входящие параметры (int a, int b, int dlina)
     * 6 - тело выполнения данного метода
     */

    public static void printRevers(String textToReverse) {
        //textToRevers = "fjfkfdfkdkl"

        for (int i = textToReverse.length() - 1; i >= 0; i--) {
            System.out.print(textToReverse.charAt(i));
        }
        System.out.println();
    }
    public static void printTextByWord(String text){
       String[] words =  text.split(" ");
        for(int i = 0; i < words.length; i++ ){
            System.out.println(words[i]);
        }


    }
}