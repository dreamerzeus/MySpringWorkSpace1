package pojo;

public class Personal {
private String name;
private int id;

public Personal(String name) {
	this.name=name;
}
public Personal(int id) {
	this.id=id;
}
public void getData()
{
	System.out.println("the name "+name+"the id is "+id);
}
}