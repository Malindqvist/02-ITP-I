import java.util.ArrayList;
import java.util.List;

public class CounterClass {
    private final List<String> longestWord = new ArrayList<>();
    private int longestWordLength;
    private int rows;
    private int chars;
    private int words;

    //Räknar raderna, tecken och ord. Har koll på det längsta ordet och om användaren skriver "stop"
    //För varje rad som skrivs körs denna metod. Input är strängen som skrivits in.
    public boolean counter(String text) {
        if(!text.equalsIgnoreCase("stop")){
            //Ökar rows med 1
            rows++;

            //Tar bort alla mellanslag och lägger till strängens längd i variabeln chars
            chars += text.replace(" ", "").length();

            //Skapar en array av strängar, separerat av mellanslag.
            String[] wordsArray = text.trim().split(" ");

            //Antal ord i arrayen räknas med .length
            words += wordsArray.length;

            /* Jämför längden på orden i wordsArray. Om ett ord är längre än föregående ord så rensas listan innan det nya längsta-ordet läggs in.
            * Om flera ord är lika långa så läggs de till i listan. */
            for(String word : wordsArray){
                if(word.length() > longestWordLength){
                    longestWord.clear();
                    longestWord.add(word);
                    longestWordLength = word.length();
                } else if(word.length() == longestWordLength){
                    longestWord.add(word);
                }
            }

            //Metoden returnerar true och nästa rad läses in via Main-metoden
            return true;
        } else {
            //Om texten innehåller ordet "stop" returneras false och resultatet skrivs ut via Main-metoden
            return false;
        }
    }

    //Returnerar antalet rader
    public int getRows() {
        return rows;
    }

    //Returnerar antalet tecken
    public int getChars(){
        return chars;
    }

    //Returnerar antalet ord
    public int getWords(){
        return words;
    }

    //Returnerar det längsta ordet
    public String getLongestWord() {
        return longestWord.toString();
    }

    //Kontrollerar om strängen är tom. Tar bort mellanslag i strängen före kontrollen
    //för att det inte ska gå att skriva in endast mellanslag som input.
    public boolean isEmptyString(String text) {
        return text.replace(" ", "").isEmpty();
    }
}
