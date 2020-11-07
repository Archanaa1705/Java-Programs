
//provides outline for what the project must do

interface dogs{
	String color= "blue";
	void behaviour();	
}

public class interfaceExample implements dogs{
	
static String name ="Tommy";

	public static void main(String[] args)  {
		
		System.out.println(color);
		interfaceExample hello=new interfaceExample();
		hello.behaviour();
		System.out.println("Dog's name :"+name);
		
	}

	public void behaviour() {
		System.out.println("The dog barks");
		System.out.println("Name is :"+name);
		
	}
	}

	