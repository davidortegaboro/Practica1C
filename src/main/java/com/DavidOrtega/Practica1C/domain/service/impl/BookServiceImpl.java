package com.DavidOrtega.Practica1C.domain.service.impl;

import com.DavidOrtega.Practica1C.domain.entity.Book;
import com.DavidOrtega.Practica1C.domain.service.BookService;
import com.DavidOrtega.Practica1C.persistence.BookRepository;
import com.DavidOrtega.Practica1C.persistence.impl.StaticBookrepositoryImpl;

import java.util.List;

public class BookServiceImpl implements BookService {

   private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<Book> getALL(){
        return  this.bookRepository.returnListBooks();
    }

    public Book findById(int id){
        return this.bookRepository.findById(id);
    }
}
