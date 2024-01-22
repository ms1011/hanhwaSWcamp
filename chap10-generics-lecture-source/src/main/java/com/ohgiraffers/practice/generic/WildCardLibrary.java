package com.ohgiraffers.practice.generic;

import com.ohgiraffers.section02.extend.vo.Bunny;
import com.ohgiraffers.section02.extend.vo.RabbitFarm;

public class WildCardLibrary {
    public void anyType(Library<?> library) {
        library.getBook().bookName();
    }

    public void extendsType(Library<? extends Fiction> library) {
        library.getBook().bookName();
    }

    public void superType(Library<? super Fiction> library) {
        library.getBook().bookName();
    }
}
