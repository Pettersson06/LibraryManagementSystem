public class Book extends Media {

    int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public void printInfo() {
        System.out.println(
            "Du hast das Buch " +
                title +
                " von " +
                author +
                ", welches " +
                pages +
                " Seiten hat, eingetragen."
        );
    }
}
