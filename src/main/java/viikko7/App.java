package viikko7;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Instrument;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        Library library = new Library();
    
        while (!exit) {
            System.out.println("1)Lisää kirja\n2) Listaa kirjat\n3) Lainaa fiktiokirja\n4) Palauta fiktiokirja\n0) Lopeta ohjelma");
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
                
            switch (i) {
                case 1:
                    System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
                    int bookType = Integer.parseInt(scanner.nextLine());
                    System.out.println("Anna kirjan nimi:");
                    String title = scanner.nextLine();
                    System.out.println("Anna kirjailijan nimi:");
                    String author = scanner.nextLine();
                    System.out.println("Anna sivumäärä:");
                    int pages = Integer.parseInt(scanner.nextLine());
                    System.out.println("Anna kirjojen määrä:");
                    int copies = Integer.parseInt(scanner.nextLine());
                    
                    if (bookType == 1 || bookType == 2) {
                        System.out.println("Kirja lisätty kirjastoon!");
                    }

                    if (bookType == 1) {
                        library.addBook(new FictionBook(title, author, pages, copies));
                    } else if (bookType == 2) {
                        library.addBook(new NonFictionBook(title, author, pages, copies));
                    }
                    else {
                        System.out.println("Virheellinen kirjatyyppi.");
                    }
                    
                    break;
                case 2:
                    library.listBooks();
                    
                    break;
                case 3:
                    System.out.println("Anna lainattavan kirjan nimi:");
                    String borrowTitle = scanner.nextLine();
                    boolean found = false;
                    for (Book book : library.getBooks()) {
                        if (book.title.equals(borrowTitle) && book instanceof FictionBook) {
                            ((FictionBook) book).borrow();
                            found = true;
                            System.out.println("Kirja " + book.title + " on nyt lainattu.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Kirjaa ei löytynyt tai sitä ei voi lainata.");
                    }
                    break;
                case 4:
                    System.out.println("Anna palautettavan kirjan nimi:");
                    String returnTitle = scanner.nextLine();
                    boolean foundReturn = false;
                    for (Book book : library.getBooks()) {
                        if (book.title.equals(returnTitle) && book instanceof FictionBook) {
                            ((FictionBook) book).returnBook();
                            foundReturn = true;
                            System.out.println("Kirja " + book.title + "  on palautettu.");
                            break;
                            
                        }
                    }
                    if (!foundReturn) {
                        System.out.println("Kirjaa ei löytynyt tai sitä ei voi palauttaa.");
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            
            
                }
            }
        }
        System.out.println("Kiitos ohjelman käytöstä.");
        scanner.close();
    }
}
