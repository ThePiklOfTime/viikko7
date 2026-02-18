package viikko7;

public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;

    public void displayInfo() {
        
    }
    abstract String categorize();
}
