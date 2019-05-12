package nl.inholland.spring5webapp.controller;

import nl.inholland.spring5webapp.model.Book;
import nl.inholland.spring5webapp.service.BookStoreService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private BookStoreService service;

    public BookController(BookStoreService service) {
        this.service = service;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Book> getAllBooks() {
        return service.getAllBooks();
    }

    /*
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Guitar getAuthorById(@PathVariable String id) {
        return service.getGuitar(id);
    }
    */

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable long id) {
        service.deleteBook(id);
    }

}
