import java.util.Scanner;

/**
 * Main class
 * @author Giovanna Fiaccabrino
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("choose your first word:");

        WordGames wordGames1 = new WordGames();

        String word = scanner.nextLine();
        System.out.println(wordGames1.addHelloWord(word));

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your surname");
        String surname = scanner.nextLine();

        System.out.println(wordGames1.getFullName(name, surname));

    }
}