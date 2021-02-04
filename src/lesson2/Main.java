package lesson2;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c =  2;


        boolean isRavnostoronniiTreugolnik = a == b && b== c && c == a;
        System.out.println(isRavnostoronniiTreugolnik);

        boolean isRaznostoronnii = a != b && b != c && c != a;
        System.out.println(isRaznostoronnii);

        boolean isRavnobedrennii = (a == b && b != c && c != a) || ( b == c && c != a && a != b);
        System.out.println(isRavnobedrennii);




    }
}
