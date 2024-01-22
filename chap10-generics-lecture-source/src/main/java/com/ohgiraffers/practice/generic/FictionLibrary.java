package com.ohgiraffers.practice.generic;

public class FictionLibrary<T extends Fiction> {
    private T book;

    public FictionLibrary() {
    }

    public FictionLibrary(T book) {
        this.book = book;
    }

    public T getBook() {
        return book;
    }

    public void setBook(T book) {
        this.book = book;
    }
}
