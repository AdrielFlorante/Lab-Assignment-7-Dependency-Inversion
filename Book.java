public class Book implements Resource {
    private String title;
    private String author;
    private boolean available = true; // I think this is fine

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void borrow() {
        if (available) {
            System.out.println("Borrowed Book: " + title);
            System.out.println("Author: " + author);
            System.out.println("Availability: " + available);
            System.out.println();
        } else {
            System.out.println("This resource: '" + title + "' is unavailable\n");
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
