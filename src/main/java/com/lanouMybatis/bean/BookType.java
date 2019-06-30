package com.lanouMybatis.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookType {
    private Integer id;
    private String tname;

    @Override
    public String toString() {
        return "BookType{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                '}';
    }
}
