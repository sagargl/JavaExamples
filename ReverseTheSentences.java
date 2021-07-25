
public class ReverseTheSentences {
	public static void main(String[] args) {
		String s="I live in India";
		
		String split[]=s.split("");
		String result="";
		for(int i=split.length-1; i>=0; i--)
		{
			result=result+(split[i]+"").trim();
			
		}
		System.out.println(result);
	}

}
