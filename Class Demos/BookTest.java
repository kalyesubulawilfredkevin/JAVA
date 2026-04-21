import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  BOOK ENTRY SYSTEM ");

        // Read book name
        System.out.print("Enter Book Name   : ");
        String bookName = scanner.nextLine();

        // Read ISBN
        System.out.print("Enter ISBN Number : ");
        String ISBN = scanner.nextLine();

        // Read author name
        System.out.print("Enter Author Name : ");
        String authorName = scanner.nextLine();

        // Read number of pages with basic validation
        int noOfPages = 0;
        while (true) {
            System.out.print("Enter No. of Pages: ");
            if (scanner.hasNextInt()) {
                noOfPages = scanner.nextInt();
                if (noOfPages > 0) {
                    break;
                } else {
                    System.out.println("   Number must be a positive . Try again.");
                }
            } else {
                System.out.println(" Invalid input. Please enter a whole number.");
                scanner.next(); // discard invalid token
            }
        }

        // Create the Book object
        Book book = new Book(bookName, ISBN, authorName, noOfPages);

        // Display book information
        System.out.println();
        System.out.println(book.getBookInfo());

        scanner.close();
    }
}
