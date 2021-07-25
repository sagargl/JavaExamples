package Constructor;

public class Hello {
	String name;
	Hello()
	{
		this.name="beginners";
		System.out.println("hello beginers");
		
	}
	
	public static void main(String[] args) {
		Hello hello=new Hello();
		System.out.println(hello.name);
		
		new Hello();
	}

}
