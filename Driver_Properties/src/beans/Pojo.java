package beans;

import java.util.Properties;
import java.util.Set;

public class Pojo 
{
	private Properties driver;

	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	public void getData()
	{
		Set s=driver.keySet();
		for(Object o1:s)
		{
			System.out.println(o1+"driver is .."+driver.getProperty(o1.toString()));
		}
	}
}