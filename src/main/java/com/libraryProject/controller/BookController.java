package com.libraryProject.controller;

import com.libraryProject.model.Book;
import com.libraryProject.repository.BookRepository;
import com.libraryProject.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/createBook")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        Book newBook = bookService.saveBook(book);
        return ResponseEntity.ok(newBook);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public void deleteBook(@PathVariable Long bookId){
        bookService.deleteBook(bookId);
    }
}
