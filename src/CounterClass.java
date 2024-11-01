import java.util.Arrays;

public class CounterClass {
    private String longestWord = "";
    private int rows;
    private int chars;
    private int words;
    /* Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.

    När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop.

            Scanner
    Vi skriver själva, programmet räknar rader och skriver ut antalet tecken

    Programmet ska bestå av två klasser:
    mainClass läser in text och skriver ut resultatet till användaren
    counterClass: räknar raderna, antal tecken
    testClass: testfall som testar counterClass

    Programmet ska versionhanteras och finnas tillgängligt på GitHub */

    //Räknar raderna, tecken och ord. Har koll på det längsta ordet och om användaren skriver "stop"
    //För varje rad som skrivs körs denna metod. Input är strängen som skrivits in.

    public boolean counter(String text) {
        if(!text.contains("stop")){
            //Ökar rows med 1
            rows++;

            //Lägger till strängens längd i variabeln chars
            chars += text.length();

            //Skapar en array av strängar, separerat av mellanslag.
            String[] wordsArray = text.trim().split(" ");

            //Antal ord i arrayen räknas med .length "- 1" används eftersom en array börjar på 0
            words += wordsArray.length;

            //Plockar ut det längsta ordet och jämför längden med tidigare inskrivna längsta-ord
            //longest =
            for(String word : wordsArray){
                if(word.length() >= longestWord.length()){
                    longestWord = word;
                }
            }
            return true;
        } else {
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

    public String getLongestWord() {
        return longestWord;
    }
}
