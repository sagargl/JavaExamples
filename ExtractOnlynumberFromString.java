
public class ExtractOnlynumberFromString {
public static void main(String[] args) {
	String str="agdkkflksdjfk9438904890lflkdjkfk";
	String str2="";
	String st3="123.00";
	/*
	 * \\d->Removes all the sequences of characters that mathes the given regex with 
	 * the given replacement string
	 */
	str2=str.replaceAll("\\d","");
	System.out.println(str2);
//	System.out.println(str2);
//	st3=st3.replaceAll("[.0-9]", "");
//	System.out.println(st3);
	st3=st3.replaceAll("\\f","");
	System.out.println("stt"+st3);
}
}
