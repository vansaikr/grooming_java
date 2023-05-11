package org.sapient.bookcatalog.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.sapient.bookcatalog.models.Book;
import org.sapient.bookcatalog.request.BookRequest;
import org.sapient.bookcatalog.response.BookResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookMapper {
    ModelMapper mapper=new ModelMapper();
    public BookMapper() {
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        mapper.typeMap(Book.class, BookRequest.class);
    }

    public Book bookRequestToBook(BookRequest request)
    {
        return mapper.map(request, Book.class);
    }

    public BookResponse bookToBookResponse(Book book) {
        return mapper.map(book, BookResponse.class);
    }

    public List<BookResponse> bookListToBookResponseList(List<Book> bookList){
        return bookList.stream().map(this::bookToBookResponse).collect(Collectors.toList());
    }

    public BookResponse intToBooleanResponse(Boolean isBookDeleted) {
        return mapper.map(isBookDeleted,BookResponse.class);
    }
}
