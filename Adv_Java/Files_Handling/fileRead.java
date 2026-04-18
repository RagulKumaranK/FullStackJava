package Adv_Java.Files_Handling;

import java.io.FileReader;
import java.io.IOException;

public class fileRead {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("Output.txt");

            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}