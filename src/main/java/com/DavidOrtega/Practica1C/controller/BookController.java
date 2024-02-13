package com.DavidOrtega.Practica1C.controller;

import com.DavidOrtega.Practica1C.domain.service.BookService;
import com.DavidOrtega.Practica1C.domain.service.impl.BookServiceImpl;
import com.DavidOrtega.Practica1C.persistence.BookRepository;
import com.DavidOrtega.Practica1C.persistence.impl.StaticBookrepositoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = new BookServiceImpl();
    }

    //Tienes que preguntar a cesar lo del dao y acabar de desarrollar los metodos

    @GetMapping("")
    public String showBooks(){
        return "books";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable int id, Model model){
        return "book";
    }
}
