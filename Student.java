public class Student {
    public void borrowBook(Resource book) {
        book.borrow();
    }
    public void borrowJournal(Resource journal) {
        journal.borrow();
    }

    // let's try borrowEBook to demonstrate how easy it is to add new resources, proving DIP
    public void borrowEBook(Resource ebook) {
        ebook.borrow();
    }
}