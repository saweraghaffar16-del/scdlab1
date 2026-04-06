public class Book {
    // Private attributes (encapsulation)
    private String title;
    private String author;
    private boolean availability;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.availability = true;
    }

    // Parameterized constructor (Constructor Overloading)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.availability = true;
    }

    // Parameterized constructor with availability (Constructor Overloading)
    public Book(String title, String author, boolean availability) {
        this.title = title;
        this.author = author;
        this.availability = availability;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return availability;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is already borrowed!");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!availability) {
            availability = true;
            System.out.println("Successfully returned: " + title);
        } else {
            System.out.println(title + " was not borrowed!");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (availability ? "Available" : "Borrowed"));
        System.out.println("------------------------");
    }
}