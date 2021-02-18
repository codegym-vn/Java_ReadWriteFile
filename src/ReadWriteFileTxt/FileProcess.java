package ReadWriteFileTxt;

import ReadWriteFileObject.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProcess {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "filename2.txt";
        String result = readFile(path);
        System.out.println(result);
    }
    public static String readFile(String path) throws FileNotFoundException {
        String result = "";
        File myObj = new File(path);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            result += myReader.nextLine();
        }
        myReader.close();
        return result;
    }

    public static void writeToFile(String pathName, String data) throws IOException {

            FileWriter myWriter = new FileWriter(pathName);
            myWriter.write(data);
            myWriter.close();

    }
}
