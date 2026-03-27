import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Media> media = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten Sie einen Film oder ein Buch eintragen?");
        String kindOfMedia = scanner.next();
        if (kindOfMedia.equals("Film")) {
            System.out.println("Wie heißt der Film den Sie eintragen möchten?");
            String title = scanner.next();
            System.out.println("Wer ist der Autor des Films?");
            String author = scanner.next();
            System.out.println("Wie lange ist der Film in Minuten?");
            int runtime = scanner.nextInt();
            Movie movie = new Movie(title, author, runtime);
            movie.printInfo();
            media.add(movie);
        } else if (kindOfMedia.equals("Buch")) {
            System.out.println("Wie heißt das Buch das Sie eintragen möchten?");
            String title = scanner.next();
            System.out.println("Wer ist der Autor des Buches?");
            String author = scanner.next();
            System.out.println("Wie viele Seiten hat das Buch?");
            int pages = scanner.nextInt();
            Book book = new Book(title, author, pages);
            book.printInfo();
            media.add(book);
        }
        scanner.close();
    }
}
