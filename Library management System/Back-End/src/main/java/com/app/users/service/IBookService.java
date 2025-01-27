package com.app.users.service;

import com.app.users.dto.BookDTO;

import java.util.List;

public interface IBookService<bookDTO> {

    BookDTO add(BookDTO book);

    public BookDTO remove(int id);
    public BookDTO update(bookDTO user, int id);


    BookDTO update(BookDTO book, int id);

    public List<BookDTO> findAll();
    public BookDTO findBook(int id);


}
