import java.util.Scanner;

public class Main {
    //Läser in text och skriver ut resultatet till användaren
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Skapar ett objekt av klassen CounterClass
        CounterClass cc = new CounterClass();
        String text;

        System.out.println("Enter text, write 'stop' to calculate the number of characters, rows, words and the longest word.");

        //Så länge metoden counter() returnerar true så fortsätter programmet att läsa in textrader
        do {
            text = scanner.nextLine();

            //Kontrollerar om strängen är tom innan metoden cc.counter() körs. Fortsätter läsa in rader tills något skrivs in.
            while(cc.isEmptyString(text)){
                System.out.println("Empty input. Please enter text.");
                text = scanner.nextLine();
            }
        } while (cc.counter(text));

        //Hämtar och skriver ut resultatet från CounterClass
        System.out.println("Characters: " + cc.getChars());
        System.out.println("Rows: " + cc.getRows());
        System.out.println("Words: " + cc.getWords());
        System.out.println("The longest word: " + cc.getLongestWord());

        //Stänger scannern
        scanner.close();
    }
}
