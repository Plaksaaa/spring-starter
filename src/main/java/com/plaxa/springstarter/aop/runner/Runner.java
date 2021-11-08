package com.plaxa.springstarter.aop.runner;

import com.plaxa.springstarter.aop.config.MyConfigAOP;
import com.plaxa.springstarter.aop.entity.Book;
import com.plaxa.springstarter.aop.entity.SchoolLibrary;
import com.plaxa.springstarter.aop.entity.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(MyConfigAOP.class);

        var book = context.getBean("book", Book.class);

        var uniLibraryBean = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibraryBean.getBook();
        uniLibraryBean.addBook("Max", book);
//        uniLibraryBean.getMagazine();
//        uniLibraryBean.returnMagazine();
//        uniLibraryBean.addBook();
//        uniLibraryBean.returnBook();

//        var schoolLibraryBean = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibraryBean.getBook();

        context.close();
    }
}
