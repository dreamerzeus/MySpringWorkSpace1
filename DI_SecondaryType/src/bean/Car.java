package bean;

public class Car {
private String carName;
private Engine engine;
public Car() {
	System.out.println("car constructor");
}
public void setCarName(String carName) {
	this.carName = carName;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void hello()
{
	System.out.println("hey...your car is "+carName+"and your engine nos is .."+engine);
}
}
