

public class SwapStringWithoutThirdNumber {
public static void main(String[] args) {
	String a="abc";
	String b="def";
	
	/*Concentate two Strings*/
	a=a+b;

	/*Takes the substring starts from the beginning index of 0 and do the difference from abcdef-def and
	 * store it in b
	 */
	/*a.length()->Returns the length of the string
	 * a.substring(0,a.length()-Prints the value from the beginning index of 0 to end string
	 * a.substring(0,a.length()-b.length()-Prints the value from the beginning index 0 to abc
	 * a.substring(b.length())-Prints the value from the a.substring(3)
	 */
	b=a.substring(0, a.length()-b.length());
	a=a.substring(b.length());
	
	System.out.println(a);
	System.out.println(b);
			
}
}
