package com.DavidOrtega.Practica1C.persistence.impl;

import com.DavidOrtega.Practica1C.domain.entity.Book;
import com.DavidOrtega.Practica1C.persistence.BookRepository;

import java.util.List;

public class StaticBookrepositoryImpl implements BookRepository {

    public List<Book> listBooks = List.of(
            new Book(1, "Pajaritos", "Cesar"),
            new Book(2, "Gatitos", "David"),
            new Book(3, "La cama", "Jose"),
            new Book(4, "Los pepitos", "Antonio")
    );

    public List<Book> returnListBooks(){
        return this.listBooks;
    }

    public Book findById(int id){
        for (Book book : this.listBooks){
            if (id == book.getId()){
                return book;
            }
        }
        return null;
    }
}
