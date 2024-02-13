package com.DavidOrtega.Practica1C.domain.service.impl;

import com.DavidOrtega.Practica1C.domain.entity.Book;
import com.DavidOrtega.Practica1C.domain.service.BookService;
import com.DavidOrtega.Practica1C.persistence.BookRepository;
import com.DavidOrtega.Practica1C.persistence.impl.StaticBookrepositoryImpl;

import java.util.List;

public class BookServiceImpl implements BookService {

   BookRepository bookRepository = new StaticBookrepositoryImpl();
    public List<Book> getALL(){
        return  bookRepository.returnListBooks();
    }

    public Book findById(){
        return bookRepository.findById();
    }
}
