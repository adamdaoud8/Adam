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
            String actual = converter.toMorse(testdata);
            assertEquals(expected, actual);
        }

        @Test
        public void testFromLetterToMorse() {
            String testdata = ".-";
            String expected = "A";
            String actual = converter.fromMorse(testdata);
            assertEquals(expected, actual);
        }

        @Test
        public void testMorseToWord() {
            String testdata = ".... . .-.. .-.. ---";
            String expected = "HELLO";
            String actual = converter.fromMorse(testdata);
            assertEquals (expected, actual);
        }
        @Test
        public void testWordToMorse(){
            String testdata = "HELLO";
            String expected = ".... . .-.. .-.. ---";
            String actual = converter.toMorse(testdata);
            assertEquals (expected , actual);
        }

        @Test
        public void testMorseToSentence() {
            String testdata = ".... . .-.. .-.. --- | .-- --- .-. .-.. -..";
            String expected = "HELLO WORLD";
            String actual = converter.fromMorse(testdata);
            assertEquals(expected, actual);
        }

        @Test
        public void testSentenceToMorse() {
            String testdata = "HELLO WORLD";
            String expected = ".... . .-.. .-.. --- | .-- --- .-. .-.. -..";
            String actual = converter.toMorse(testdata);
            assertEquals(expected , actual);
        }
    }