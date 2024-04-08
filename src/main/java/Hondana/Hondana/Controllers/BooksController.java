package Hondana.Hondana.Controllers;

import Hondana.Hondana.Services;
import Hondana.Hondana.books.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "hondana/book")
public class BooksController {

    private final Services.BooksService booksservice;

    @Autowired
    public BooksController(Services.BooksService booksService) {
        this.booksservice = new Services.BooksService();
    }

    @GetMapping
    public List<Books> getBooks() {

        return booksservice.getBooks();
    }

//    @PostMapping
//    public List<Books> postBooks(){
//
//    }
}
