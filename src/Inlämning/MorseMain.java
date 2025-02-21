package Inlämning;

import java.util.Scanner;

public class MorseMain {

    // Huvudklass som hanterar in- och ut matning

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterLogik converter = new ConverterLogik();

        System.out.println("Välj alternativ: \n1. Text till Morse \n2. Morse till Text");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Skriv text att konvertera till Morse:");
            String text = scanner.nextLine();
            System.out.println("Morse-kod: " + ConverterLogik.toMorse(text));


        } else if (choice == 2) {
            System.out.println("Skriv Morse-kod att konvertera till text (använd mellanslag mellan bokstäver och '|' mellan ord)");
            String morse = scanner.nextLine();
            System.out.println("Text: " + ConverterLogik.fromMorse(morse));

        } else {
            System.out.println("Ogiltigt val");
        }
    }
}