package com.capgemini.spring_assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee);
    }
}