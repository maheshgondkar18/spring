package com.example.demo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("book")
public class Book {

    @Id
    private String b_name;
    private String b_price;
    private String b_author;

    @Override
    public String toString() {
        return "Book{" +
                "b_name='" + b_name + '\'' +
                ", b_price='" + b_price + '\'' +
                ", b_author='" + b_author + '\'' +
                '}';
    }

    public Book(String b_name, String b_price, String b_author) {
        this.b_name = b_name;
        this.b_price = b_price;
        this.b_author = b_author;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_price() {
        return b_price;
    }

    public void setB_price(String b_price) {
        this.b_price = b_price;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }
}
