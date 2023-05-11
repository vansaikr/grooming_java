package org.sapient.bookcatalog.controller;

import org.sapient.bookcatalog.exception.BookNotFoundException;
import org.sapient.bookcatalog.mapper.BookMapper;
import org.sapient.bookcatalog.models.Book;
import org.sapient.bookcatalog.request.BookRequest;
import org.sapient.bookcatalog.response.BookResponse;
import org.sapient.bookcatalog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookMapper bookmapper;

    @GetMapping("/")
    ResponseEntity<List<BookResponse>> getUsers(){
        List<Book> bookList = bookService.getAllBooks();
        return new ResponseEntity<>(bookmapper.bookListToBookResponseList(bookList), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<BookResponse> getUserByEmail(@PathVariable("id") int id) throws BookNotFoundException {
        Book book = bookService.getBookById(id);
        return new ResponseEntity<>(bookmapper.bookToBookResponse(book), HttpStatus.OK);
    }

    @PostMapping("/save")
    ResponseEntity<BookResponse> addBook(@RequestBody BookRequest request) {
        System.out.println(request);
        System.out.println("mapper"+bookmapper.bookRequestToBook(request));
        Book book = bookService.saveBook(bookmapper.bookRequestToBook(request));
        return new ResponseEntity<>(bookmapper.bookToBookResponse(book), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<BookResponse> deleteApplicationByEmail(@PathVariable("id") int id) throws BookNotFoundException{
        Boolean isBookDeleted = bookService.deleteBook(id);
        return new ResponseEntity<>(bookmapper.intToBooleanResponse(isBookDeleted), HttpStatus.OK);
    }

}
