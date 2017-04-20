package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new ClassPathXmlApplicationContext("resouces/spring.xml");
Test t=(Test)ac.getBean("c");
	}

}
