package pojo;

public class Bus {
private Engine eng;
public Bus(Engine eng) {
	this.eng=eng;
}
public void printData()
{
	System.out.println("the engine type is "+eng.getEngineType());
}
}
