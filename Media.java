public class Media {

    String title;
    String author;

    public Media(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        System.out.println(author + " ist der Autor von " + title + ".");
    }
}
