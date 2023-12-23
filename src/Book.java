import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int bookYear;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, bookYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", bookYear=" + bookYear +
                '}';
    }
}

