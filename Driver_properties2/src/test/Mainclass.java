package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Bean;

public class Mainclass {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("resources/spring.xml");
	Bean b=(Bean) ac.getBean("c");
	b.getData();
}
}
