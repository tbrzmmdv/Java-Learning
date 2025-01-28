package Lesson16;

import java.io.IOException;

import static Lesson16.Checked.readFile;


public class Main {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {
            throw new RuntimeException("Unchecked exception:"+e.getMessage());
        }
    }
}

