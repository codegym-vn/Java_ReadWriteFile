package ReadWriteFileTxt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcess {
    public static void main(String[] args) {
        String path = "filename2.txt";
        writeToFile(path,"Hello C11G1");
        String result = readFile(path);
        System.out.println(result);
    }
    public static String readFile(String path) {
       String result = "";
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                result = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        }
        return result;
    }

    public static void writeToFile(String pathName, String data) {
        try {
            FileWriter myWriter = new FileWriter(pathName);
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
