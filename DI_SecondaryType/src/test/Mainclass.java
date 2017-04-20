package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s[]=new String[]{"resources/Car.xml","resources/Engine.xml"};
		ApplicationContext ac=new ClassPathXmlApplicationContext(s);
		Car c=(Car)ac.getBean("c");
		c.hello();
	}

}
