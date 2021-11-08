package com.plaxa.springstarter.aop.aspect;

import com.plaxa.springstarter.aop.entity.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice : logging getting students list before method getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void afterGetStudentsLoggingAdvice(List<Student> students) {
        var firstStudent = students.get(0);
        var nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        var avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("afterGetStudentsLoggingAdvice : logging getting students list after method getStudents");
    }
}
