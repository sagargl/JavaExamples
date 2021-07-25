package ProgramList;

public class Test2 {
	public static void main(String[] args) {
		String s=" i love my india";
		String s1[]=s.split("");
		String result="";
		for(int i=s1.length-1; i>=0; i--)
		{
			result=result+s1[i];
		}
	}

}
