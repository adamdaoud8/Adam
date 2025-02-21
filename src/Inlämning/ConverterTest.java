package Inlämning;

import org.junit.jupiter.api.Test;
import org.testng.Converter;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    ConverterLogik converter = new ConverterLogik();

    @Test
    public void testMorseToLetter() {
        String testdata = "A";
        String expected = ".-";
        String actual = ConverterLogik.toMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testFromLetterToMorse() {
        String testdata = ".-";
        String expected = "A";
        String actual = ConverterLogik.fromMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToWord() {
        String testdata = ".... . .-.. .-.. ---";
        String expected = "HELLO";
        String actual = ConverterLogik.fromMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testWordToMorse() {
        String testdata = "HELLO";
        String expected = ".... . .-.. .-.. ---";
        String actual = ConverterLogik.toMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToSentence() {
        String testdata = ".... . .-.. .-.. --- | .-- --- .-. .-.. -..";
        String expected = "HELLO WORLD";
        String actual = ConverterLogik.fromMorse(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testSentenceToMorse() {
        String testdata = "HELLO WORLD";
        String expected = ".... . .-.. .-.. --- | .-- --- .-. .-.. -..";
        String actual = ConverterLogik.toMorse(testdata);
        assertEquals(expected, actual);
    }

    // Fel Hanteringar:

    @Test
    public void testEmptyInmput() {
        String actualMorse = ConverterLogik.toMorse("");
        String actualText = ConverterLogik.fromMorse("");
        assertEquals("", actualMorse);
        assertEquals("", actualText);
    }

    @Test
    public void testInvalidCharacter() {
        String testdata = "123"; // Innehåller siffror som inte stöds
        String expected = ""; // Eller en specifik felhantering om önskat
        String actual = ConverterLogik.toMorse(testdata);
        assertEquals(expected, actual);
    }
}