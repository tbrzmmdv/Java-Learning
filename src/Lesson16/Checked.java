package Lesson16;

import java.io.IOException;

public class Checked {
    public static void readFile() throws IOException {
        throw new IOException("File tapilmadi");
    }
}
