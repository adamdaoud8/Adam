package Inlämning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Logikklass för Morse-kod konvertering

    public class ConverterLogik {

        private static final Map<Character, String> textToMorse = new HashMap<>();
        private static final Map<String, Character> morseToText = new HashMap<>();

        {
            String[][] morseArray = {
                    {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."},
                    {"E", "."}, {"F", "..-."}, {"G", "--."}, {"H", "...."},
                    {"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."},
                    {"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."},
                    {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
                    {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"},
                    {"Y", "-.--"}, {"Z", "--.."}, {" ", "|"}
                    // Mellanslag ersätts med | i Morse
            };

            for (String[] pair : morseArray) {
                textToMorse.put(pair[0].charAt(0), pair[1]);
                morseToText.put(pair[1], pair[0].charAt(0));
            }
        }

        public static String toMorse(String text) {
            StringBuilder morse = new StringBuilder();
            text = text.toUpperCase();

            for (char c : text.toCharArray()) {
                if (textToMorse.containsKey(c)) {
                    morse.append(textToMorse.get(c)).append(" ");
                }
            }
            return morse.toString().trim();
        }

        public static String fromMorse(String morse) {
            StringBuilder text = new StringBuilder();
            String[] words = morse.split(" ");

            for (String word : words) {
                if (morseToText.containsKey(word)) {
                    text.append(morseToText.get(word));
                }
            }
            return text.toString();
        }
    }