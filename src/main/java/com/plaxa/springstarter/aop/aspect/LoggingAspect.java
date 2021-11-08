package com.plaxa.springstarter.aop.aspect;

import com.plaxa.springstarter.aop.entity.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.Predicate;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    /*@Pointcut("execution(* com.plaxa.springstarter.aop.entity.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(public void com.plaxa.springstarter.aop.entity.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Pointcut("execution(* com.plaxa.springstarter.aop.entity.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* com.plaxa.springstarter.aop.entity.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibraryAdvice : writing Log #10");
    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice : writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice : writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice : writing Log #3");
    }*/

    @Before("com.plaxa.springstarter.aop.aspect.MyPointcut.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        var signature = (MethodSignature) joinPoint.getSignature();
        System.out.println(signature.getMethod());
        System.out.println(signature.getReturnType());
        System.out.println(signature.getName());

        if (signature.getName().equals("addBook")) {
            var args = joinPoint.getArgs();

            for (Object o : args) {
                if (o instanceof Book book) {
                    System.out.println(book);
                } else if (o instanceof String) {
                    System.out.println("persons name is : " + o);
                }
            }
        }

        System.out.println("Logging aspect : trying to get book or magazine");

//    @Before("execution(public * returnBook())")

   /* @Before("execution(public void returnBook())")
    public void beforeReturnBook() {
        System.out.println("beforeReturnBook !!!");
    }*/
    }
}
