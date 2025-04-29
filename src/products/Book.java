package products;
public class Book extends Product{
    private static int number = 0;

    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        setAuthor(author);
        setGenre(genre);
        setPublication(publication);
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublication() {
        return publication;
    }

    @Override
    public String toString() {
        return  super.toString() +"author : " +getAuthor()+"genre : " + getGenre() + " publication :" +getPublication();
    }

    @Override
    public String generateId() {
        number++;
        if (number>9) {

            setId("2" + String.format("%02d",number));
            return "2" + String.format("%02d",number);
        }
        setId("1" + String.format("%03d",number));
        return "1" + String.format("%03d",number);
    }
}
