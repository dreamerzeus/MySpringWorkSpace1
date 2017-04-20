package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Bus;
import pojo.Car;
import pojo.Train;

public class Mainclass {
	public static void main(String[] args) {
		//ApplicationContext ac=new ClassPathXmlApplicationContext("resources/byType.xml");
		//ApplicationContext ac=new ClassPathXmlApplicationContext("resources/byName.xml");
    	//ApplicationContext ac=new ClassPathXmlApplicationContext("resources/Constructor.xml");
		ApplicationContext ac=new ClassPathXmlApplicationContext("resources/autoDetect.xml");
		Train c=(Train)ac.getBean("t");
		c.getData();
	}

}
