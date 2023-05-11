package org.sapient.bookcatalog.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book_details")
public class Book {
    @Id
    @Column(name = "book_id_no")
    private Integer bookId;

    @Column(name="book_name")
    private String bookName;
    @Column(name="book_description")
    private String bookDescription;
}
