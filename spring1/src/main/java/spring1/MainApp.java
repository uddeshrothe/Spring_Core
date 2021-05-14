package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
//		Triangle triangle = new Triangle();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Address address1 =(Address) context.getBean("address1");
//		System.out.println(address1);
//		
		Customer customer1 = (Customer) context.getBean("customer1");
		System.out.println(customer1);
		
//		Address addresst = (Address) context.getBean("addresst");
//		System.out.println(addresst);
//		
		((AbstractApplicationContext) context).close();
	}
	

}
