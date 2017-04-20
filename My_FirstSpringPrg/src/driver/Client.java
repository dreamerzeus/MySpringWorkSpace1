package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		//find the xml file
		Resource r=new ClassPathResource("resources/spring.xml");
		
		//loading xml into container
		BeanFactory bf=new XmlBeanFactory(r);
		
		//creating test class object 
		Object o=bf.getBean("t");
		Test t=(Test)o;
		t.hello();
		

	}

}
