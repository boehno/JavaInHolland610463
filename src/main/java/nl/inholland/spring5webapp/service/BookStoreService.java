package nl.inholland.spring5webapp.service;

import nl.inholland.spring5webapp.model.*;
import nl.inholland.spring5webapp.repositories.AuthorRepository;
import nl.inholland.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookStoreService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Iterable<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Iterable<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void addAuthor(Author author){
        authorRepository.save(author);
    }

    public void deleteBook(long id){
        bookRepository.delete(bookRepository.findById(id).orElseThrow(IllegalArgumentException::new));
    }

    public void deleteAuthor(long id){
        authorRepository.delete(authorRepository.findById(id).orElseThrow(IllegalArgumentException::new));
    }

}
