package com.ohgiraffers.practice.generic;

public class Application {
    public static void main(String[] args) {

        FictionLibrary<Fiction> fictionLibrary1 = new FictionLibrary<>();
        FictionLibrary<SF> fictionLibrary2 = new FictionLibrary<>();
//        Library<Book> library2 = new Library<>();

        Math math = new Math();
        NonFiction nonFiction = new NonFiction();
        SF sf = new SF();
        Fiction fiction = new Fiction();

        WildCardLibrary wildCardLibrary = new WildCardLibrary();
        wildCardLibrary.anyType(new Library<Math>(math));
        wildCardLibrary.anyType(new Library<NonFiction>(nonFiction));
        wildCardLibrary.anyType(new Library<SF>(sf));

        wildCardLibrary.extendsType(new Library<SF>(sf));
//        wildCardLibrary.extendsType(new Library<NonFiction>());

        wildCardLibrary.superType(new Library<Fiction>(fiction));
//        wildCardLibrary.superType(new Library<SF>());

    }
}
