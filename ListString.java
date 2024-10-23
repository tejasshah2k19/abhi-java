import java.util.Scanner;
import java.util.ArrayList;

public class ListString {
    public static void main(String[] args) {
        int choice;
        Scanner scr = new Scanner(System.in);
        NameList obj = new NameList();

        while (true) {
            System.out.println("1.  Add Name \n2.  List All Name \n3.  Remove Name \n4.  Search Name\n5.  Exit ");
            System.out.println("Enter the choice");
            choice = scr.nextInt();

            switch (choice) {
                case 1:
                    obj.addName();
                    break;
                case 2:
                    obj.printNames();
                    break;
                case 3:
                    obj.removeName();
                    break;
                case 4:
                    obj.searchName();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}

class NameList {

    ArrayList<String> names = new ArrayList<>();
    Scanner scr = new Scanner(System.in);

    void addName() {
        System.out.println("Enter Name");
        String name = scr.next();
        names.add(name);

    }

    void printNames() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    void removeName() {
        System.out.println("Enter Name that you want to delete");
        String name = scr.next();
        names.remove(name);
    }

    void searchName() {
        System.out.println("Enter name that you want to check?");
        String name = scr.next();

        if (names.contains(name)) {
            System.out.println("Name Present");
        } else {
            System.out.println("Name not found");
        }
    }
}
