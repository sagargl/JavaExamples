package Inheritence;

public class ChildClass extends ParentClass{

	
	ChildClass()
	{
		System.out.println("Constructor of Child");
	}

	void disp()
	{
		super.disp();
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		ChildClass child=new ChildClass();
		child.disp();
	}
}
