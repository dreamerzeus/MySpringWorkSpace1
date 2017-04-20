package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Pojo;

public class Mainclass 
{
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
	    Pojo p=(Pojo)ac.getBean("t");
	    p.printData();
	}

}
