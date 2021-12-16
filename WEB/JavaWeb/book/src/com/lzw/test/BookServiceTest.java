package com.lzw.test;

import com.lzw.pojo.Book;
import com.lzw.pojo.Page;
import com.lzw.service.BookService;
import com.lzw.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class BookServiceTest {

    private BookService bookService = new BookServiceImpl();
    @Test
    public void addBook() {
        bookService.addBook(new Book(null,"疯子在右","Lzw2",new BigDecimal(108),201,9,null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(22);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(22,"天才在左","Lzw",new BigDecimal(108),201,9,null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(22));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void page(){
        System.out.println(bookService.page(1, Page.PAGE_SIZE));
    }

    @Test
    public void pageByPrice(){

        System.out.println(bookService.pageByPrice(1, Page.PAGE_SIZE,10,50));
    }
}