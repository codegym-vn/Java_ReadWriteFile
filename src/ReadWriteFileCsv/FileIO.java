package ReadWriteFileCsv;

import java.io.*;
import java.util.List;

public class FileIO {

    public static void write(List<List<String>> rows, String PATH) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH))) {
            bw.write("Id");
            bw.write(",");
            bw.write("Name");
            bw.write(",");
            bw.write("Address");
            bw.newLine();
            for (List<String> rowData : rows) {
                bw.write(String.join(",", rowData));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void read(String path){
        try (BufferedReader bir = new BufferedReader(new FileReader(path))) {
            String line = bir.readLine();
            while (line != null) {
                line = bir.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
