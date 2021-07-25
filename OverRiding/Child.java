package OverRiding;

public class Child extends Parent{

	public void disp(){
		System.out.println("disp() method of Child class");
	   }
	
	public static void main(String[] args) {
		Parent par =new Parent();
		par.disp();
		
		Parent par1=new Child();
		par1.disp();
		
		
		
	}
}
