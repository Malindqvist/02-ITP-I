
public class CounterClass {
    private String longestWord = "";
    private int rows;
    private int chars;
    private int words;

    //Räknar raderna, tecken och ord. Har koll på det längsta ordet och om användaren skriver "stop"
    //För varje rad som skrivs körs denna metod. Input är strängen som skrivits in.
    public boolean counter(String text) {
        if(!text.equalsIgnoreCase("stop")){
            //Ökar rows med 1
            rows++;

            //Lägger till strängens längd i variabeln chars
            chars += text.length();

            //Skapar en array av strängar, separerat av mellanslag.
            String[] wordsArray = text.trim().split(" ");

            //Antal ord i arrayen räknas med .length
            words += wordsArray.length;

            //Plockar ut det längsta ordet och jämför längden med tidigare inskrivna längsta-ord
            for(String word : wordsArray){
                if(word.length() > longestWord.length()){
                    longestWord = word;
                }
            }

            //Metoden returnerar true och nästa rad läses in i Main-metoden
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
        return longestWord;
    }

    //Kontrollerar om strängen är tom
    public boolean isEmptyString(String text) {
        return text.isEmpty();
    }
}
