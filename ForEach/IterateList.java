package ForEach;

import java.util.ArrayList;
import java.util.List;

public class IterateList {
	public static void main(String[] args) {
		List<String>fruits=new ArrayList<String>();
		fruits.add("Apple");
	      fruits.add("Orange");
	      fruits.add("Banana");
	      fruits.add("Pear"); 
	      fruits.add("Mango");
	      /*Print all the String values*/
	      fruits.forEach(s->System.out.println(s));
	
List<Integer>value=new ArrayList<Integer>();
value.add(10);
value.add(70);
value.add(30);
value.add(60);
value.add(50);
/*Print all the Integer Values*/
value.forEach(v->System.out.println(v));
}
}