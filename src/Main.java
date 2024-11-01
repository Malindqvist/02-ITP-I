import java.util.Scanner;

public class Main {
    //Läser in text och skriver ut resultatet till användaren
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Skapar ett objekt av klassen CounterClass
        CounterClass cc = new CounterClass();
        String text;

        System.out.println("Skriv en text, skriv 'stop' för att avsluta");

        do {
            text = scanner.nextLine();
        } while (cc.counter(text));

        System.out.println("Characters: " + cc.getChars());
        System.out.println("Rows: " + cc.getRows());
        System.out.println("Words: " + cc.getWords());
        System.out.println("Longest word: " + cc.getLongestWord());
    }
}
