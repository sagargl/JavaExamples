package ForEach;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {
	public static void main(String[] args) {
		Map<Integer,String>hmap=new HashMap<Integer,String>();
		hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      /*Get All the values*/
	      hmap.forEach((key,value)->System.out.println(key+"\t:"+value));
	      
	      /*Get 4th key with respective value*/
	      hmap.forEach((key,value)->
	      {
	    	  if(key==4)
	    	  {
	    		  System.out.println("Value associated with key 4 is: "
	    		  		+ ""+value);
	    	  }
	      });
	      
	      /*Get the key wrt to Cat value
	       * 
	       */
	      hmap.forEach((key,value)->
	      {
	    	  if("Cat".equals(value))
	    	  {
	    		  System.out.println("Key associated with Value Cat is: "+key);
	    	  }
	      });
	}

}
