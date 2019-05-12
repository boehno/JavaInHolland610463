package nl.inholland.spring5webapp.controller;

import nl.inholland.spring5webapp.model.Author;
import nl.inholland.spring5webapp.service.BookStoreService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthorController {

    private BookStoreService service;

    public AuthorController(BookStoreService service) {
        this.service = service;
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Author> getAllAuthors() {
        return service.getAllAuthors();
    }

    /*
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Guitar getAuthorById(@PathVariable String id) {
        return service.getGuitar(id);
    }
    */

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
public void deleteGuitar(@PathVariable long id) {
    service.deleteAuthor(id);
}

}
