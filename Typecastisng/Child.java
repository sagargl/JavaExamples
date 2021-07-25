package Typecastisng;

public class Child extends Parent {
	void sample()
	{
		System.out.println("child class");
	}
	public static void main(String[] args) {
		
		//Parent par= new Child();
	//	Parent par=(Parent) new Child();
		//spar.sample();
		
	Parent par1=new Child();
		Child child=(Child)par1;
		child.sample();
	}

}
