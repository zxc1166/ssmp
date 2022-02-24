package com.zxc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zxc.domain.Book;

import java.util.List;

public interface IBookService {
    Boolean save(Book book);
    Boolean delete(Integer id);
    Boolean update(Book book);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage,int pageSize);
}
