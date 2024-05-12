public class EBook implements Resource {
    private String title;
    private String author;
    private String fileFormat; // Because it's an E-Book...
    private boolean available = true;

    public EBook(String title, String author, String fileFormat) {
        this.title = title;
        this.author = author;
        this.fileFormat = fileFormat;
    }


    @Override
    public void borrow() {
        if (available) { // So that the available boolean flag actually does something.
            available = false;
            System.out.println("Borrowed EBook: " + title);
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
