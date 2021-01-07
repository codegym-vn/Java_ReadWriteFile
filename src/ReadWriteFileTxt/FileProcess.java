package ReadWriteFileTxt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcess {
    public static void main(String[] args) {
        WriteToFile();
        ReadFile();
    }
    public static void ReadFile() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        }
        System.out.println(1);
    }

    public static void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter("filename2.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
