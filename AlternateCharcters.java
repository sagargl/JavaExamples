import org.testng.annotations.Test;

public class AlternateCharcters {
	@Test
	public void Alternate() {
		
	String s="sagar";
	char[]s1=s.toCharArray();
	System.out.println(s1);
	for(int i=0; i<s1.length; i+=2)
	{
		System.out.println(s1[i]);
	}
	}

}
