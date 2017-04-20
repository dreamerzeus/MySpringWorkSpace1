package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Beans;

public class Mainclass
{

public static void main(String[] args)
{
ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring.xml");
Beans b=(Beans)ac.getBean("t");
b.getDta();

}

}
