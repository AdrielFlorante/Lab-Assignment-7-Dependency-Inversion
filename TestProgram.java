public class TestProgram {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // Create resources...
        Resource book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Resource book2 = new Book("1984", "George Orwell");
        // Never knew what explicit casting was before, this is kinda cool --> This is unnecessary but I'm leaving it here po.
        ((Book) book2).setAvailable(false); // Now George Orwell's book 1984 is unavailable as someone took it, or it's simply not in the library.

        Resource journal = new Journal("Meditations", "Marcus Aurelius"); // It's practically a journal :D

        Resource ebook = new EBook("The Great Gatsby", "F. Scott Fitzgerald", "PDF");


        // Students try to borrow books from resources
        student1.borrowBook(book1);
        student2.borrowBook(book2); // Will be unavailable
        student2.borrowJournal(journal);

        student3.borrowEBook(ebook);
        student3.borrowJournal(journal); // Will be unavailable
    }
}
