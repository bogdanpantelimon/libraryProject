package com.libraryProject.service;

import com.libraryProject.model.Book;
import com.libraryProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Save book
    public Book saveBook(Book book){
        Book newBook = bookRepository.save(book);
        return newBook;
    }

    //Get all books
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    //Get book by id


    //Delete a book
    public String deleteBook(Long id){
        bookRepository.deleteById(id);
        return "Book Deleted";
    }
}
