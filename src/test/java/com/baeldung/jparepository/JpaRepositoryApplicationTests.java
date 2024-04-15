package com.baeldung.jparepository;

import com.baeldung.jparepository.model.Book;
import com.baeldung.jparepository.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpaRepositoryApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    void insertBooksIntoDB() {
        bookService.insertBook(new Book(1L, "Katekizmas"));
        bookService.insertBook(new Book(2L, "Marti"));
        bookService.insertBook(new Book(3L, "Dievų miškas"));
    }

    @Test
    void verifyThreeBooksExistInDB() {
        List<Book> books = bookService.list();

        Assertions.assertEquals(books.size(), 3);
    }
}
