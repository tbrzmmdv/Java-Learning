package Lesson17.Task2;

import java.util.Random;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        int can=5;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"MESSI", "HYUNDAI", "JAVA"};
        int randomIndex = random.nextInt(words.length);
        String selectedWord = words[randomIndex];
        if (selectedWord.equals(words[0])) {
            System.out.println("Category: Football Player");
        } else if (selectedWord.equals(words[1])) {
            System.out.println("Category: Car Model");
        } else if (selectedWord.equals(words[2])) {
            System.out.println("Category: Programming Language");
        }

        boolean[] guessedLetters = new boolean[selectedWord.length()];

        System.out.print("Söz: ");
        for (int i = 0; i < selectedWord.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();

        while (true) {
            System.out.print("Zehmet olmasa bir harf daxil edin: ");
            String inputChar = scanner.nextLine().toUpperCase();

            if (inputChar.length() == 1) {
                boolean correctGuess = false;


                for (int j = 0; j < selectedWord.length(); j++) {
                    if (inputChar.charAt(0) == selectedWord.charAt(j)) {
                        guessedLetters[j] = true;
                        correctGuess = true;
                    }
                }


                if (!correctGuess) {
                    System.out.println("Sehv texmin");
                    can--;
                }
                if (can == 0){
                    System.out.println("caniniz bitmisdir ");
                    break;

                }else {
                    boolean wordGuessed = true;
                    for (boolean guessed : guessedLetters) {
                        if (!guessed) {
                            wordGuessed = false;
                        }
                    }

                    if (wordGuessed) {
                        System.out.println("Tebrikler.Söz:" + selectedWord);
                        break;
                    }


                    System.out.print("Söz: ");
                    for (int i = 0; i < selectedWord.length(); i++) {
                        if (guessedLetters[i]) {
                            System.out.print(selectedWord.charAt(i) + " ");
                        } else {
                            System.out.print("_ ");
                        }
                    }
                    System.out.println();
                }


            }
        }

    }
}
