package com.ohgiraffers.practice.generic;

public class Library<T extends Book> {
    private T book;

    public Library() {
    }

    public Library(T book) {
        this.book = book;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }
}
