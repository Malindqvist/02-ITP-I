import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {
    @Test
    void testIfEmpty(){
        CounterClass cc = new CounterClass();
        boolean expected = false;

        boolean actual = true;
        assertEquals(expected, actual);
    }

    //test för stopp
    //test för längsta

    @Test
    void testCounterRows(){
        CounterClass cc = new CounterClass();
        cc.counter("katt ko häst");
        cc.counter("ko häst");
        int expected = 2;

        int actual = cc.getRows();
        assertEquals(expected, actual);
    }

    @Test
    void testCounterChars(){
        CounterClass cc = new CounterClass();
        cc.counter("katt ko häst");
        int expected = 12;

        int actual = cc.getChars();
        assertEquals(expected, actual);
    }

    @Test
    void testLongestWord(){
        CounterClass cc = new CounterClass();
        cc.counter("häst katten ko");
        String expected = "katten";

//        String actual = cc.getLongest();
//        assertEquals(expected, actual);
    }

    @Test
    void testStopInput(){
        CounterClass cc = new CounterClass();
        cc.counter("stop");
        boolean expected = false;
        boolean actual = cc.counter("stop");
    }

}

/* Testklass som testar logikklassens output. T.ex.
Tomt, ingen text
Kontrollera rader
Kontrollera tecken
Testa en gräns eller olika metoder

JUnit-testfall
Till programmet ska minst tre JUnit-testfall skrivas
Testfallen ska skilja sig märkvärt åt och testa olika delar av programmet
Programmet ska versionhanteras och finnas tillgängligt på GitHub
Endast en länk till repo med koden behöver lämnas in för del 2 */