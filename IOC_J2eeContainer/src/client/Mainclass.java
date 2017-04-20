package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
       System.out.println("xl validation and object creation completed");
	}

}
