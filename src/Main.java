import java.util.Scanner;

public class Main {
    //Läser in text och skriver ut resultatet till användaren
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Skapar ett objekt av klassen CounterClass
        CounterClass cc = new CounterClass();
        String text;

        System.out.println("Enter text, write 'stop' to calculate the number of characters, rows, words and the longest word.");

        do {
            text = scanner.nextLine();
        } while (cc.counter(text));

        System.out.println("Characters: " + cc.getChars());
        System.out.println("Rows: " + cc.getRows());
        System.out.println("Words: " + cc.getWords());
        System.out.println("The longest word: " + cc.getLongestWord());
    }
}
