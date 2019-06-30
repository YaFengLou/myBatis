package com.lanouMybatis.dao;

import com.lanouMybatis.bean.Book;

import java.util.List;

public interface BookDao {
    List<Book> queryAllBook();
}
