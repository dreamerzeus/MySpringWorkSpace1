package pojo;

public class Train {
	private Engine eng;
	public Train() {
		System.out.println("inside default");
	}
public Train(Engine eng)
{
	this.eng=eng;
	System.out.println("inside paramterized constructor");
}

public void setEng(Engine eng) {
	this.eng = eng;
}
public void getData()
{
	System.out.println("the engine type is "+eng.getEngineType());
}
}
