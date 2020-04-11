package com.book;

import com.book.controller.BookController;
import com.book.domain.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookControllerTest {

    @Test
    public void shouldCreateBookControllerInstance(){
        BookController bookController = new BookController();
        Assert.assertNotNull(bookController);
    }

    @Test
    public void getBookShouldReturnBookJson(){
        Book book = new Book();
        book.setTitle("Book Test");

        BookController bookController = new BookController();
        Book retValue = bookController.getBook();

        Assert.assertEquals(book.getTitle(),retValue.getTitle());
    }
}
