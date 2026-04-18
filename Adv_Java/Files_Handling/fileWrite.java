package Adv_Java.Files_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
    public static void main(String[] args) {

        try {
            FileWriter fm = new FileWriter("Output.txt");
            fm.write("Hello");
            fm.close();

            System.out.println("Success");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}