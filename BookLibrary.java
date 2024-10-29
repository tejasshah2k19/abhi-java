import java.util.Scanner;

public class BookLibrary {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int choice;
        Book b1 = new Book();
        while (true) {

            System.out.println("\n1 For Add Book\n2 For Print Book\n0 For Exit\nEnter choice");
            choice = scr.nextInt();

            switch (choice) {
                case 1:
                    b1.readBook();
                    break;
                case 2:
                    b1.printBookDetail();
                    break;
                case 0:
                    System.exit(0);

                default:
                    break;
            }// switch
        } // while
    }// main
}// class

class Book {
    String ISBN;
    String title;
    String author;
    String category;
    //this
    void dummy(String title){
        System.out.println(title);//local variable   -> dummy method 
        System.out.println(this.title);//instance variable ->  class -> 
    }

    // instance
    void readBook() {
        Scanner scr = new Scanner(System.in);// local
        System.out.println("Enter ISBN");
        ISBN = scr.next();
        System.out.println("Enter Title and Author Name");
        title = scr.next();
        author = scr.next();
        System.out.println("Enter Category");
        category = scr.next();
      
    }

    void printBookDetail() {
        System.out.println(ISBN + "  " + title + "  " + author + " " + category);
    }
}
