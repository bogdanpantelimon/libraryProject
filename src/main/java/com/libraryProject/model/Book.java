package com.libraryProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookId;
    @Column(name = "bookName", nullable = false)
    private String bookName;
    @Column(name = "bookAuthor", nullable = false)
    private String bookAuthor;
}
