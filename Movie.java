public class Movie extends Media {

    int runtime;

    public Movie(String title, String author, int runtime) {
        super(title, author);
        this.runtime = runtime;
    }

    @Override
    public void printInfo() {
        System.out.println(
            "Du hast den Film " +
                title +
                " von " +
                author +
                ", welcher " +
                runtime +
                " Minuten lang ist, eingetragen!"
        );
    }
}
