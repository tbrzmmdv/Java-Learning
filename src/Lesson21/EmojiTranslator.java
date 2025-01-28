package Lesson21;

import java.util.Scanner;

public class EmojiTranslator {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("***********Welccome To The Emoji Translator***********");
        System.out.println("Please write a sentence for translate:");
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        try {
            System.out.println("Loading...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String[] words=input.split(" ");
        String[] wordsList = {
                "Smile", "Laugh", "Love", "Cool", "Sad", "Angry", "Think", "ThumbsUp", "ThumbsDown", "Party",
                "Heart", "Sparkle", "Fire", "Rainbow", "Pizza", "Trophy", "Rocket", "Earth", "Dog", "Cat"
        };
        String[] emojisList = {
                "😀", "😂", "🥰", "😎", "😢", "😡", "🤔", "👍", "👎", "🎉",
                "❤️", "✨", "🔥", "🌈", "🍕", "🏆", "🚀", "🌍", "🐶", "🐱"
        };

        StringBuilder translatedSentence=new StringBuilder();

        for (String word:words){
            boolean found = false;
            for (int i=0;i<wordsList.length;i++){
                if (word.equalsIgnoreCase(wordsList[i])){
                    translatedSentence.append(emojisList[i]).append(" ");
                    found=true;
                    break;
                }
            }
            if (!found){
                translatedSentence.append(word).append(" ");
            }

        }
        System.out.println(translatedSentence.toString().trim());













    }
}
