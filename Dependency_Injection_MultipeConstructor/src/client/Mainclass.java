package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Bean;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
      Bean b=(Bean)ac.getBean("t");	
      b.test();
	}

}
