package Lesson16;

import java.io.IOException;


import static Lesson16.Checked2.readFile2;

public class Main2 {
    public static void main(String[] args) {
        try {
            readFile2();
        } catch (IOException e) {
            System.out.println("Exception:"+e);
        }
        finally {
            System.out.println("Finally istifade olunub");
        }
    }
}
