package ReadWriteFileObject;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Menus menu = new Menus();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1: Add");
            System.out.println("2: Get All");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    Student s = menu.formAdd();
                    m.add(s);
                    break;
                case 2:
                    m.getAll();
            }
        }while(true);
    }
}
