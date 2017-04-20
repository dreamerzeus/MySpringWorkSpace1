package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Bean;

public class Client {
public static void main(String[] args) throws Exception {
	ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
	Bean b=(Bean) ac.getBean("c");
	b.getConnect();
}
}
