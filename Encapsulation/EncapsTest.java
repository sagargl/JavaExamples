package Encapsulation;

import java.util.HashSet;
import java.util.Set;

public class EncapsTest {
	public static void main(String[] args) {
		EncapsulationDemo enc=new EncapsulationDemo();
		enc.setSsn(10);
		enc.setEmpname("sagar");
		System.out.println("empname"+enc.getEmpname());
		System.out.println("empid"+enc.getSsn());
		
		Set<EncapsulationDemo>set=new HashSet<EncapsulationDemo>();
		Set<Object>set1=new HashSet<Object>(enc);
	}

}
