package viikko7;

public class FictionBook extends Book {

    public FictionBook(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }
    @Override
    String categorize() {
        return "Fiktiokirja";
    }
    
}
