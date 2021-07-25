package Streams;

import java.util.ArrayList;
import java.util.List;

public class forEach {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();  
	       list.add("Rick");         
	       list.add("Negan");       
	       list.add("Daryl");         
	       list.add("Glenn");         
	       list.add("Carl"); 


	       
	       
	       for(String str: list)
	       {
	    	   System.out.println("list values is" +str);
	       }
	       
	       list.forEach((str1)-> System.out.println("list values"+str1));
	}

}
