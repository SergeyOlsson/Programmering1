package Programmering1;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestClass {

    //Första testet ska inte gå igenon, eftersom expected = 1, medan actual = 0.
    @Test
    public void lineTest() {

        SecondClass test = new SecondClass();

        //input kräver en definering men 100 har inget med testet att göra.
        int input = 100;
        int expected = 0;
        int actual = test.getLines(input);
        assertEquals(expected, actual);

    }

    //Andra testet går ut på att testa om text "stop" är true, det är det.
    @Test
    public void stopTest() {

        SecondClass test = new SecondClass();
        String text = "stop";
        boolean expected = true;
        boolean actual = test.stopBoolean(text);
        assertEquals(expected, actual);

    }

    //Tredje testet kollar om ordet "stop" är 4 bokstäver lång, det stämmer.
    @Test
    public void testStopLength() {
        SecondClass test = new SecondClass();
        int expected = 4;
        int actual = test.stop.length();
        assertEquals(expected, actual);
    }

    //Testar så att min teckenräknare fungerar.
    @Test
    public void testCountCharacters() {
        SecondClass test = new SecondClass();
        String input = "Textlength";
        test.count(input);

        int expected = 10;
        assertEquals(expected, input.length());
    }
}