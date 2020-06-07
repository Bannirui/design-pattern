package com.example.design.pattern.example.service.prototype;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
public class BookTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Base base = new Base(1L);
        Book book = new Book("水浒传", "施耐庵", 20F, base);
        Object bookClone = book.clone();

        book.getBase().setId(2L);

        System.out.println("origin: " + book);
        System.out.println("clone: " + bookClone);
    }
}
