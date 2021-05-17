package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Answer {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
		Question question1 = (Question) context.getBean("question1");
		
		System.out.println(question1.getQuestion());
		System.out.println(question1.getListAnswer());
		System.out.println(question1.getSetAnswer());
		System.out.println(question1.getMapAnswer());

	}

}
