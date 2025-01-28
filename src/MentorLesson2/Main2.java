package MentorLesson2;

import java.util.Random;
import java.util.UUID;

public class Main2 {
    public static void main(String[] args) {
        Population[] insanlar=new Population[4];
        insanlar[0]=new Population("Tebriz",19);

        insanlar[1]=new Population("Veli",20);

        insanlar[2]=new Population("Eli",21);

        insanlar[3]=new Population("Tural",22);

        for (Population insanlarinSayi :insanlar){
            System.out.println(insanlarinSayi.introduce());
        }

    }



}
