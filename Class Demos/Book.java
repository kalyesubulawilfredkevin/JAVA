//class represents a book in the library
class Books {
    // atrributes
    private int id;
    private String title;
    private String author;
    private String status;
    private String yearPublished;
    // constructor
    // this runs when u create a book object 
    Books(int id, String title, String author, String status, String yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.status = status;
        this.yearPublished = yearPublished;
    }
     //prints all the book details
    void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + status);
        System.out.println("YearPublished: " + yearPublished);
    }
    // updates the book's status
    String setStatus(String newStatus) {
        this.status = newStatus;
        return status;
    }

    String setYearPublished(String newYearPublished) {
        this.yearPublished = newYearPublished;
        return yearPublished;
    }

    String setAuthor(String author) {
        this.author = author;
        return author;
    }

}
// library members
class Members {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String telno;

    Members(int id, String firstname, String lastname, String email, String telno) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telno = telno;

    }

    void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Email: " + email);
        System.out.println("Telno: " + telno);

    }

}
// represents a librarian
class Librarians {
    int id;
    String name;
    String telno;

    Librarians(int id, String name, String telno) {
        this.id = id;
        this.name = name;
        this.telno = telno;

    }

    void displayInfo() {
        System.out.println("Id: " + id);
        System.out.println("name: " + name);
        System.out.println("Telno: " + telno);

    }

}

public class Book {
    public static void main(String[] args) {
        // creates book
        Books book1 = new Books(1, "Merchant of Venice", "William Shakespeare", "Available", "1600");
        Books book2 = new Books(2, "Pride and Prejudice", "Jane Austen", "Borrowed", "1813");
        Books book3 = new Books(3, "To Kill a Mockingbird", "Harper Lee", "Available", "1960");

        /*
         * System.out.println("all the books");
         * book1.displayInfo();
         * System.out.println();
         * 
         * book2.displayInfo();
         * System.out.println();
         * 
         * book3.displayInfo();
         * System.out.println();
         */
        // initial info edited//
        book1.displayInfo();
        book1.setStatus("Borrowed");
        book2.displayInfo();
        book2.setYearPublished("1820");
        book3.displayInfo();
        book3.setAuthor("Harper Leon");
        // updates displayed//
        System.out.println();
        book1.displayInfo();
        System.out.println();
        book2.displayInfo();
        System.out.println();
        book3.displayInfo();

        /// members

        System.out.println("=========");
        Members member1 = new Members(20, "Mubiru", "Peter", "peter@gmail.com", "0700505404");
        Members member2 = new Members(25, "Kamoga", "Rahim", "peter@gmail.com", "0700505404");

        System.out.println("all members");
        member1.displayInfo();

        System.out.println();
        member2.displayInfo();

        // librarian
        System.out.println("=====");
        Librarians librarian1 = new Librarians(12, "Kamuka john", "070000000");
        Librarians librarian2 = new Librarians(12, "kapate mark", "070000000");

        System.out.println("");
        librarian1.displayInfo();
        System.out.println();
        librarian2.displayInfo();

    }
}
