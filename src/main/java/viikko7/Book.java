package viikko7;

public abstract class Book {
    String title;
    String author;
    int pages;
    int copies;

    public void displayInfo() {
        System.out.println("Nimi: " + title + ", Kirjailija: " + author + ", Sivut: " + pages + ", Määrä: " + copies);
    }
    abstract String categorize();
}
