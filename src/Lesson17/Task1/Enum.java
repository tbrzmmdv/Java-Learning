package Lesson17.Task1;

import Lesson16.Main;

public class Enum {
    public enum Month{
        YANVAR,FEVRAL,MART,APREL,MAY,IYUN,IYUL,AVQUST,SENTYABR,OKTYABR,NOYABR,DEKABR
    }

    public static void main(String[] args) {
        Month thisMonth=Month.DEKABR;

        if (thisMonth==Month.DEKABR){
            System.out.println("Dekabr ayindayiq");

        }

    }
}
