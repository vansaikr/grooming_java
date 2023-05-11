package org.sapient.bookcatalog.service;

import org.sapient.bookcatalog.exception.BookNotFoundException;
import org.sapient.bookcatalog.models.Book;
import org.sapient.bookcatalog.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public Book saveBook(Book book){
        bookRepository.save(book);
        return book;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(int bookId) throws BookNotFoundException {
        Optional<Book> book = bookRepository.findById(bookId);
        return book.orElseThrow(() -> new BookNotFoundException("Book with id " +bookId +" not found"));
    }

    public boolean deleteBook(int bookId) {
        if(getBookById(bookId)==null){
            throw new BookNotFoundException("Book cannot be deleted with given bookId "+ bookId);
        }
        else{
            bookRepository.deleteById(bookId);
            return true;
        }
    }
}
