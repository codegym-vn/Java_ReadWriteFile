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
    
    public static long hi(){
        return 7;
    }

    public static void main(String[] args) {
        int a = 8;
        String sonDt = "abc";
        String sonxt = "abc";
        String ka = new String("abc");
        System.out.println(sonDt.hashCode());
        System.out.println(ka.hashCode());
        System.out.println(sonxt.hashCode());
        boolean isEqual = sonDt == ka ;
        System.out.println(isEqual);
    }
}
