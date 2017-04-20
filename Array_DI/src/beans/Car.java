package beans;

public class Car 
{
	private String[] carName;
	private Engine[] engine;

	
	public void setCarName(String[] carName) {
		this.carName = carName;
	}


	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}


	public void printCarDetails()
	{
		for(String cn:carName)
		{
			System.out.println(cn);
		}
		for(Engine eng:engine)
		{
			System.out.println(eng.getEngineType());
		}
	}

}
