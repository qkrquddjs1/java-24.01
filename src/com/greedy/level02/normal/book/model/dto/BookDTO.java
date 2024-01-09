package com.greedy.level02.normal.book.model.dto;

public class BookDTO {


    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public void setTitle(String title){this.title = title;}
    public void setPublisher(String publisher){this.publisher = publisher;}
    public void setauthor(String author){this.author = author;}
    public void setPrice(int price){this.price = price;}
    public void setdiscountRate(double discountRate){this.discountRate = discountRate;}


    public String getTitle(){return title; }
    public String getPublisher(){return publisher; }
    public String getAuthor(){return author; }
    public int getPrice(){return price;}
    public double getDiscountRate(){return discountRate;}


}
