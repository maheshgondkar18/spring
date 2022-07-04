package com.example.demo.Controller;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepository repo;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Book b){
        repo.save(b);
        return  new ResponseEntity<String>("Object is inserted", HttpStatus.OK);
    }
}
