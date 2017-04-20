package client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("resources/spring.xml");
		
		BeanFactory bf=new XmlBeanFactory(r);//xml validation
        System.out.println("sucessful xml validation");
        
        bf.getBean("t");
        bf.getBean("t");
        bf.getBean("t");}

}
