package bean;

public class Engine {
private String enginetype;
public Engine() {
	System.out.println("inside engine const");
}
public String getEnginetype() {
	return enginetype;
}

public void setEnginetype(String enginetype) {
	this.enginetype = enginetype;
}

}
