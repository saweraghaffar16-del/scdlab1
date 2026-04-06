public class Main {
    public static void main(String[] args) {
        System.out.println("===== LIBRARY BOOK MANAGEMENT SYSTEM =====\n");

        // Creating book objects using constructor overloading
        Book book1 = new Book("Math", "AhmedGhaffar");
        Book book2 = new Book("Urdu", "SanaGhaffar", true);
        Book book3 = new Book(); // Using default constructor
        book3.setTitle("2002");
        book3.setAuthor("HussnainGhaffar");

        // Display initial book details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        // Borrowing books
        book1.borrowBook();
        book2.borrowBook();
        book2.borrowBook(); // Trying to borrow already borrowed book
        book1.returnBook();
        book3.returnBook(); // Book not borrowed

        // Display final details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        // Additional operations
        System.out.println("Is '" + book1.getTitle() + "' available? " + (book1.isAvailable() ? "Yes" : "No"));
        System.out.println("Is '" + book2.getTitle() + "' available? " + (book2.isAvailable() ? "Yes" : "No"));

    }
}
