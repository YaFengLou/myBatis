package com.lanouMybatis.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Integer id;
    private String bname;
    private String author;
    private Integer gender;
    private Integer price;
    private String description;

    private BookType bookType;
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", bookType=" + bookType +
                ", author='" + author + '\'' +
                ", gender=" + gender +
                ", price=" + price +
                ", description='" + description + '\'' +
                "}\n";
    }
}
