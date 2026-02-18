package viikko7;

public class FictionBook extends Book implements Borrowable {
    private int borrowedCopies = 0;
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
    
    @Override
    public void borrow() {
        if (this.copies > 0) {
            this.copies--;
            this.borrowedCopies++;
            System.out.println("Kirja " + this.title + " lainattu.");
        } else {
            System.out.println("Kirja " + this.title + " ei ole enää lainattavissa.");
        }
        
    }

    @Override
    public void returnBook() {
        
        
        this.borrowedCopies--;
        if (this.borrowedCopies < 0) {
            this.borrowedCopies = 0; 
            System.out.println("Kirja " + this.title + " ei ole lainassa.");

        }
        else {
            this.copies++;
            System.out.println("Kirja " + this.title + " on palautettu.");
        }

    }
}
