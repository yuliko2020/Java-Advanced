package lesson14Book;

/**
 * JavaAdvanced
 * 06/08/2020
 */
public class Book implements Comparable <Book> {
    private String  author ;
    private String publication;
    private int yearOfPublishing;

    public Book(String author, String publication, int yearOfPublishing) {
        this.author = author;
        this.publication = publication;
        this.yearOfPublishing = yearOfPublishing;
    }
// author
    @Override
    public int compareTo(Book book) {
        return this.author.compareTo(book.author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }

}
