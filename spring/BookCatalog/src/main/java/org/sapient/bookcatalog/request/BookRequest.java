package org.sapient.bookcatalog.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    @JsonProperty("book_id")
    private int bookId;

    @JsonProperty("book_name")
    private String bookName;

    @JsonProperty("book_description")
    private String bookDescription;
}
