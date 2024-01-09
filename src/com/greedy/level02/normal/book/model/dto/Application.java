package com.greedy.level02.normal.book.model.dto;

public class Application {
    public static void main(String[] args) {
      BookDTO book = new BookDTO();
        System.out.println(book.getTitle());
        System.out.println(book.getPublisher());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getDiscountRate());


    }
}
