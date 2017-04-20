package pojo;

public class Car {
private String carName;
private Engine eng;
public void setCarName(String carName) {
	this.carName = carName;
}
public void setEng(Engine eng) {
	this.eng = eng;
}
public void getData()
{
	System.out.println("the car name "+carName);
	System.out.println("the engine type is "+eng);
}
}
