package client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Mainclass {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
	Test t=(Test) ac.getBean("t");
    t.getData();
	}
}
