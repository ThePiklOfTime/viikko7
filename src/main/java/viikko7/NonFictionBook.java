package viikko7;

public class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, int pages, int copies) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.copies = copies;
    }

    @Override
    String categorize() {
        return "Tietokirja";
    }
}
