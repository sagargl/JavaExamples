
public class StringWordLength {
public static void main(String[] args) {
	String sentences="hello my world";
	String [] words=sentences.split("\\s+");
	System.out.println(words.length);
}
}
