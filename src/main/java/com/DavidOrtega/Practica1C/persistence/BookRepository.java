package com.DavidOrtega.Practica1C.persistence;

import com.DavidOrtega.Practica1C.domain.entity.Book;


import java.util.List;

public interface BookRepository {
    public List<Book> returnListBooks();

    public Book findById(int id);
}
