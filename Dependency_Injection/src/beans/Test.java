package beans;

public class Test {
private String gender;
private int id;

public void setGender(String gender) {
	this.gender = gender;
}

public void setId(int id) {
	this.id = id;
}

public void getData()
{
	System.out.println("the gender "+gender+" the title "+id);
}
}
