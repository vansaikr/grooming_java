package org.sapient.bookcatalog.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(String message){super(message);}
}
