package com.rahul.cab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
@Autowired
	private Engine eng;
public void printData()
{
	System.out.println("the eng is "+eng.getEngType());
}
}
