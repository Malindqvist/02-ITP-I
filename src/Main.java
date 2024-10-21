import java.util.Scanner;

public class Main {
    //Läser in text och skriver ut resultatet till användaren
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CounterClass cc = new CounterClass();
        String text;

        System.out.println("Skriv en text, skriv 'stop' för att avsluta");
        text = scanner.nextLine();
        while(!text.contains("stop")){
            cc.counter(text);
            text = scanner.nextLine();
        }

        if(text.contains("stop")){
            System.out.println("Characters: " + cc.getChars());
            System.out.println("Rows: " + cc.getRows());
            System.out.println("Words: " + cc.getWords());
        }
    }
}
