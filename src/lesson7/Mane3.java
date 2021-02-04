package lesson7;

public class Mane3 {

    public static void main(String[] args) {
        char[] charsFrom = {'q', 'w', 'e', 'r'};
        char[] charsTo = {'Q', 'W', 'E', 'R'};

        String text = "I am programmer, qwerty";

        char[] charsFromText = text.toCharArray();

        for (int i = 0; i < charsFromText.length; i++) {
            for (int j = 0; j < charsFrom.length; j++) {
             if (charsFromText[i] == charsFrom[j]){

                charsFromText[i] = charsTo[j];

            }

        }
        System.out.print(charsFromText[i]);

    }

}
}
