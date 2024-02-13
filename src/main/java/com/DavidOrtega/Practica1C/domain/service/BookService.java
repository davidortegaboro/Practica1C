package com.DavidOrtega.Practica1C.domain.service;

import com.DavidOrtega.Practica1C.domain.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getALL();

    public Book findById();
}
