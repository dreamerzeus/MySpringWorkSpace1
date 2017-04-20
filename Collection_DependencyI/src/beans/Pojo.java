package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Pojo {
private List fruit;
private Map countryCap;
private Set cricketers;
public void setFruit(List fruit) {
	this.fruit = fruit;
}
public void setCountryCap(Map countryCap) {
	this.countryCap = countryCap;
}
public void setCricketers(Set cricketers) {
	this.cricketers = cricketers;
}
public void printData()
{
	for(Object obj:fruit)
	{
		System.out.println("the fruits are "+obj);
	}
	for(Object obj1:cricketers)
	{
		System.out.println("the cricketers are "+obj1);
	}
	System.out.println("the country and capital are ");
	Set key=countryCap.keySet();
	for(Object obj3:key)
	{
		System.out.println("country "+obj3+"capital "+countryCap.get(obj3));
	}
}
}
