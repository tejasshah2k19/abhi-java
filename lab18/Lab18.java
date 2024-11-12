import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class Lab18 {
    public static ArrayList<Customer> readCustomers(String filename)
            throws IOException {

        // Array list of Customer objects
        ArrayList<Customer> list = new ArrayList<>();
        // Create a new File object
        File file = new File(filename);
        // If the file does not exist, throw a FileNotFound exception
        if (file.exists() == false) {
            throw new FileNotFoundException(file + " Not found");
        }
        // Create a new Scanner on the file object
        Scanner scr = new Scanner(file);
        // While fileScanner has a next line

        int rating;
        double balance;
        String firstName;
        String lastName;
        while (scr.hasNextLine()) {
            String line = scr.nextLine();
            String data[] = line.split(",");

            try {
                rating = Integer.parseInt(data[2]);
            } catch (NumberFormatException e) {
                rating = 0;
                System.out.println("Bad rating Value : " + data[2]);
            }

            try {
                balance = Double.parseDouble(data[3]);
            } catch (NumberFormatException e) {
                balance = 0;
                System.out.println("Bad Balance Value : " + data[3]);
            }

            firstName = data[0];
            lastName = data[1];

            Customer customer = new Customer(firstName, lastName, rating, balance);
            list.add(customer);

        }
        // Read the next line and split it
        // Convert the rating to an int; throw NumberFormatException if bad
        // Convert the balance to a double; throw NumberFormatException if bad
        // Create a new customer object, add it to list
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Customer> clist = null;
        // Problem 3
        // Call readCustomers with the data file as a parameter
        try {
            clist = readCustomers("customers.csv");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        // Print the array list
        System.out.println("Original list");
        for (int i = 0; i < clist.size(); i++) {
            System.out.println(clist.get(i));
        }

        // Problem #4
        // Create PriorityQueue queue1
        PriorityQueue<Customer> queue1 = new PriorityQueue<>();
        try {
            for (int i = 0; i < clist.size(); i++) {
                queue1.add(clist.get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        // Problem #5
        // Create PriorityQueue queue2
        CustomerComparator comparator = new CustomerComparator();
        PriorityQueue<Customer> queue2 = new PriorityQueue<>(comparator);
        try {
            for (int i = 0; i < clist.size(); i++) {
                queue2.add(clist.get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        // Problem #6
        // Remove things one at a time from queue1 and print them
        System.out.println("Queue1 processing");
        while (true) {
            try {
                Customer c = queue1.element();
                queue1.remove();
                System.err.println(c);
            } catch (Exception e) {
                System.out.println("Done");
                break;
            }
        }

        // Problem #7
        // Remove things one at a time from queue2 and print them
        System.out.println("Queue2 processing");
        while (true) {
            try {
                Customer c = queue2.element();
                queue2.remove();
                System.err.println(c);
            } catch (Exception e) {
                System.out.println("Done");
                break;
            }
        }
        // Problem #8
        // Try this on your own
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("customers.csv", true));
            writer.newLine();
            writer.write("jack,martin,2.3,200.0");
            writer.newLine();
            writer.write("johny,robert,2,twoHundred");
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Problem #9
        problem9();
    }

    public static void problem9() {
        ArrayList<String> sList = new ArrayList<>();

        try {
            File file = new File("testdata.txt");
            Scanner scr = new Scanner(file);
            while (scr.hasNextLine()) {
                String data = scr.nextLine();
                sList.add(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        // lines containing any digit
        Pattern p = Pattern.compile("[0-9]");
        System.out.println("*********Lines That Contains Digit************");
        for (int i = 0; i < sList.size(); i++) {

            String data = sList.get(i);
            Matcher m = p.matcher(data);
            if(m.find()){
                System.out.println(data);
            }
        }

        // - lines containing any letter, either case
        p = Pattern.compile("[a-zA-Z]");
        System.out.println("*********Lines That Contains Letters************");
        for (int i = 0; i < sList.size(); i++) {

            String data = sList.get(i);
            Matcher m = p.matcher(data);
            if(m.find()){
                System.out.println(data);
            }
        }
        // - lines containing an integer
        p = Pattern.compile("^[0-9]+$");
        System.out.println("*********Lines That Contains Integers************");
        for (int i = 0; i < sList.size(); i++) {

            String data = sList.get(i);
            Matcher m = p.matcher(data);
            if(m.find()){
                System.out.println(data);
            }
        }
        // - any line that begins with the letter "a"
        // - any line that ends with the letter "s"
        // - any line that contains a left parenthesis
        // - lines that contain an "a" and an "e" in either order
        // - lines containing the lower case vowels next to each other, in order (a, e,
        // i, o, u)
        // - lines containing the lower case vowels in order, but not necessarily next
        // to each other

    }
}

class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getBalance() > o2.getBalance()) {
            return 1;
        } else if (o1.getBalance() < o2.getBalance()) {
            return -1;
        }
        return 0;
    }
}