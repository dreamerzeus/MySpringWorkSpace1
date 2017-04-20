package pojo;

public class Bean {
private String name;
private String email;
private int age;
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setAge(int age) {
	this.age = age;
}
public void test()
{
	System.out.println("hello mr"+name+"you email id is "+email+"and your age is "+age);
}
}
