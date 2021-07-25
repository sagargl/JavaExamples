import java.util.ArrayList;
import java.util.List;

public class RemoveOccurencesOfString {
	public static void main(String[] args) {
		String name[]= {"Hello", "world", "this", "is", "my", "world"};
		List<String>a1=new ArrayList<String>();

		int size=name.length;
		System.out.println(size);
		for(int i=0; i<name.length; i++)
		{
			for(int j=i+1; j<name.length; j++)
			{
				if(name[i].equalsIgnoreCase(name[j]))
				{
					if(!a1.contains(name[j]))
					{
						a1.add(name[i]);
						System.out.println(name[i]);
					}
				}
			}
		}
		
		
	}

}
