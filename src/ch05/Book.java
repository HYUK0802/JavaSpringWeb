package ch05;

public class Book {
    public String title;
    public int price;
    public String company;
    public String author;
    public int page;
    public String isbn;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
