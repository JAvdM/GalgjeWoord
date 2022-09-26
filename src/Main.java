import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("galgje woord:");

        String userInput = scanner.nextLine();
        ArrayList<Character> woordBak = new ArrayList<>();

        for (int i = 0; i < userInput.length(); i++) {
            woordBak.add('_');
        }

        while (woordBak.contains('_')) {
            System.out.println(woordBak);

            System.out.println("Raad een letter:");

            char geradenLetter = scanner.next().charAt(0);
            char[] uiArray = userInput.toCharArray();
            //String[] uiArray = userInput.split("");

            for (int i = 0; i < userInput.length(); i++) {
                if (uiArray[i] == geradenLetter) {
                    woordBak.set(i, geradenLetter);
                }
            }
        }

        System.out.println(woordBak + "\n");

        System.out.println("Spel afgelopen!");
    }
}