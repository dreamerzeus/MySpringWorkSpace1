package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
@Qualifier(value="e1")
@Autowired()
private Engine eng;
public void printData()
{
	System.out.println("the eng type of bus is "+eng);
}
}
