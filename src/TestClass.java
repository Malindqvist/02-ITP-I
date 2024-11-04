import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {
    @Test
    //Kontrollerar om strängen är tom
    void testIsEmptyString_withEmptyString_returnsTrue(){
        CounterClass cc = new CounterClass();
        boolean expected = true;

        boolean actual = cc.isEmptyString("");
        assertEquals(expected, actual);
    }

    @Test
    //Kontrollerar att det inte går att skriva enbart mellanslag som input
    void testIsEmptyString_withBlankSpaces_returnsTrue(){
        CounterClass cc = new CounterClass();
        boolean expected = true;

        boolean actual = cc.isEmptyString("    ");
        assertEquals(expected, actual);
    }

    @Test
    //Testar att raderna räknas korrekt
    void testCounterRows(){
        CounterClass cc = new CounterClass();
        cc.counter("katt ko häst");
        cc.counter("ko häst");
        int expected = 2;

        int actual = cc.getRows();
        assertEquals(expected, actual);
    }

    @Test
    //Testar att tecken räknas korrekt
    void testCounterChars(){
        CounterClass cc = new CounterClass();
        cc.counter("katt ko häst");
        int expected = 10;

        int actual = cc.getChars();
        assertEquals(expected, actual);
    }

    @Test
    //Testar att orden räknas korrekt
    void testCounterWords(){
        CounterClass cc = new CounterClass();
        cc.counter("katt ko häst");
        cc.counter("katt ko häst");
        int expected = 6;

        int actual = cc.getWords();
        assertEquals(expected, actual);
    }

    @Test
    //Testar beräkningen för det längsta ordet
    void testCounterLongestWord(){
        CounterClass cc = new CounterClass();
        cc.counter("häst katten ko");
        String expected = "katten";

        String actual = cc.getLongestWord();
        assertEquals(expected, actual);
    }

    @Test
    //Testar att metoden counter() reagerar på ordet "stop"
    void testCounterText_withStringStop_returnsFalse(){
        CounterClass cc = new CounterClass();
        boolean expected = false;

        boolean actual = cc.counter("stop");
        assertEquals(expected, actual);
    }

    @Test
    //Testar att metoden counter() inte reagerar på ordet "stopp"
    void testCounterText_withStringStopp_returnsTrue(){
        CounterClass cc = new CounterClass();
        boolean expected = true;

        boolean actual = cc.counter("stopp");
        assertEquals(expected, actual);
    }
}
