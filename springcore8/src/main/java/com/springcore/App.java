package com.springcore;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


//Driver class
public class App {

public static void main(String[] args)
    throws Exception
{

    ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("com/springcore/spring.xml");

    cap.close();
}
}
