package ReadWriteFileObject;
import java.util.ArrayList;

public class Methods {
    ArrayList<Student> students = new ArrayList<>();
    private static final String FILE_PATH = "obj.dat";

    public void add(Student s){
        students = (ArrayList<Student>) FileProcess.readFromFile(FILE_PATH);
        students.add(s);
        FileProcess.writeObjectToFile(students,FILE_PATH);
    }

    public void getAll(){
       ArrayList<Student> students = (ArrayList<Student>) FileProcess.readFromFile(FILE_PATH);
        for (Student s: students) {
            System.out.println(s.toString());
        }
    }
}
