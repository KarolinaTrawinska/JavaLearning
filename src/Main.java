import enums.WeekDays;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferRedreader = new BufferedReader(new FileReader("test.txt"));
            String line = bufferRedreader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferRedreader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}