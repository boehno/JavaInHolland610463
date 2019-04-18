package nl.inholland.service;

import nl.inholland.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookshopService {

    List<Book> books = new ArrayList<>(
            Arrays.asList(
                    new Book("0", "TSAONGAF", "Mark"),
                    new Book("1", "Rich Dad", "Kiyosaki"),
                    new Book("2", "The internet of Money", "Antonopoulos")
            )
    );

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
