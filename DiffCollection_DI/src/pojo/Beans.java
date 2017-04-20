package pojo;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Beans {
private Vector name;
private  TreeSet title;
private Hashtable cc;
public void setName(Vector name) {
	this.name = name;
}
public void setTitle(TreeSet title) {
	this.title = title;
}
public void setCc(Hashtable cc) {
	this.cc = cc;
}
public void getDta()
{
	for(Object obj:name)
	{
		System.out.println("the vector name are "+obj);
	}
	for(Object obj1:title)
	{
		System.out.println("the hash title are "+title);
	}
	System.out.println("the country and capital are ");
	Set map=cc.keySet();
	for(Object obj3:map)
	{
		System.out.println("the country "+obj3+"capital "+cc.get(obj3));
	}
}
}
