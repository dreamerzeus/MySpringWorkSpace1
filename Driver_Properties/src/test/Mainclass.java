package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Pojo;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
	Pojo p=(Pojo)ac.getBean("t");
	p.getData();
	}

}
