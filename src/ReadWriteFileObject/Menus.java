package ReadWriteFileObject;

import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);
    public Student formAdd(){
        Student s = new Student();
        System.out.println("Enter your age");
        s.setAge(Integer.parseInt(input.nextLine()));
        System.out.println("Enter your first name");
        s.setFirstName(input.nextLine());
        System.out.println("Enter your last name");
        s.setLastName(input.nextLine());
        return s;
    }
}
