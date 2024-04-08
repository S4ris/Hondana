package Hondana.Hondana;

import Hondana.Hondana.books.Books;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Services {
    @Service
    public static class BooksService {

        public List<Books> getBooks() {
            return List.of(
                    new Books(
                            1,
                            9999999,
                            "Full Metal Alchemist",
                            "Story about Elric brothers",
                            4.9,
                            LocalDate.of(2000, Month.APRIL,6)
                    )
            );
        }
    }
}
