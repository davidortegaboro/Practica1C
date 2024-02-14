package com.DavidOrtega.Practica1C;

import com.DavidOrtega.Practica1C.domain.service.BookService;
import com.DavidOrtega.Practica1C.domain.service.impl.BookServiceImpl;
import com.DavidOrtega.Practica1C.persistence.BookRepository;
import com.DavidOrtega.Practica1C.persistence.impl.StaticBookrepositoryImpl;

public class BookIoCcontainer {

    private static BookService service;

    private static BookRepository repository;

    public static BookService getService(){
        if (service == null){
            service = new BookServiceImpl(getRepository());
        }
        return service;
    }

    private static BookRepository getRepository(){
        if (repository == null){
            repository = new StaticBookrepositoryImpl();
        }
        return repository;
    }
}
