package dosyaislemi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;

public class readAndWritedosya {

    public void olustur(String dosyaadi) {
        try {
            File myObj = new File(dosyaadi + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void write(String s, String dosyaAdi) {
        try {
            FileWriter write = new FileWriter(dosyaAdi + ".txt");
            write.write(s);
            write.close();
            System.out.println("Sucssefuly  ... ");
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void read(String dosyaadi) {
        try {
            File myObj = new File(dosyaadi + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void readmassage(String dosyaadi, Label s) {
        try {
            File myObj = new File(dosyaadi + ".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                s.setText(data);
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
