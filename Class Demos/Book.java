public class Book {
    private String bookName;
    private String ISBN;
    private String authorName;
    private int noOfPages;

    // Constructor
    public Book(String bookName, String ISBN, String authorName, int noOfPages) {
        this.bookName   = bookName;
        this.ISBN       = ISBN;
        this.authorName = authorName;
        setNoOfPages(noOfPages); // use setter for validation
    }

    // Setters
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = (noOfPages > 0) ? noOfPages : 0;
    }

    // Getters
    public String getBookName() {
        return bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    // ── getBookInf
    public String getBookInfo() {
        return  "BOOK INFORMATION\n"
              + String.format("  Book Name   : %s%n", bookName)
              + String.format("  ISBN        : %s%n", ISBN)
              + String.format("  Author      : %s%n", authorName)
                + String.format("  No. of Pages: %d%n", noOfPages);
              
    }
}
