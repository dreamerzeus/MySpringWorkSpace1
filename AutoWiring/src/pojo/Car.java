package pojo;

public class Car {
private Engine eng;

public void setEng(Engine eng) {
	this.eng = eng;
}

public void printData()
{
	System.out.println("the engine type is "+eng.getEngineType());
}
}
