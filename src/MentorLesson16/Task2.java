package MentorLesson16;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        boolean eyniHerf=false;
        Scanner scanner = new Scanner(System.in);

        String palindrom = scanner.nextLine();

        String[] palindromeWord = palindrom.split(" ");

        String[] word = new String[palindromeWord.length];

//        System.out.println(palindromeWord.length);

        String firstWord=palindromeWord[0];
        String lastWord=palindromeWord[palindromeWord.length-1];
        System.out.println(firstWord);
        System.out.println(lastWord);

        for (int j=0;j<firstWord.length();j++){
            if (firstWord.charAt(j) == lastWord.charAt(lastWord.length() - j - 1)) {
                eyniHerf = true;

            }
            else {
                eyniHerf=false;
            }

        }
        if (eyniHerf==true){
            System.out.println("Bu polindromdur");
        }
        else {
            System.out.println("Bu polindrom deyil");
        }



//        for (int i = 0; i < palindromeWord.length; i++) {
//            word[i] = palindromeWord[i];
//            System.out.println(palindromeWord[i]);
//        }



    }


}
