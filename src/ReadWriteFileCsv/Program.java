package ReadWriteFileCsv;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Student s = new Student(1,"sonmc","Hn");
        Student s2 = new Student(2,"sonmc2","Hn2");
        List<List<String>>rows = Arrays.asList(
                Arrays.asList(s.id+"", s.name, s.address),
                Arrays.asList(s2.id+"", s2.name, s2.address)
        );
        String path = "./src/students.csv";

        FileIO.write(rows,path);
        FileIO.read(path);
    }
}
