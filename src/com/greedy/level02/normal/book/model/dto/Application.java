package com.greedy.level02.normal.book.model.dto;

public class Application {
    public static void main(String[] args) {
      BookDTO book = new BookDTO();
        System.out.print(book.getTitle()+ ", ");
        System.out.print(book.getPublisher()+ ", ");
        System.out.print(book.getAuthor()+ ", ");
        System.out.print(book.getPrice()+ ", ");
        System.out.print(book.getDiscountRate());


    }
}
