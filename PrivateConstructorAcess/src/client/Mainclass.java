package client;

import java.lang.reflect.Constructor;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Class c=Class.forName("beans.Pojo");
        	Constructor c1[]= c.getDeclaredConstructors();
        	c1[0].setAccessible(true);
        	c1[0].newInstance(null);
        }
        catch(Exception e)
        {
        	
        }
	}

}
