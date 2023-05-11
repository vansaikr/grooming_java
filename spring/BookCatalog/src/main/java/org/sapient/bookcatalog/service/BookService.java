package org.sapient.bookcatalog.service;

import org.sapient.bookcatalog.models.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int bookId);
    boolean deleteBook(int bookId);
}
