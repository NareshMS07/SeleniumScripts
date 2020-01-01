package dec26;

public class Equal_EqualIgnoreCase {

	public static void main(String[] args) {
	String str1="Hello";
	String str2="hello";
	String str3="HELLO";
	String str4="Hello";
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str3));
	System.out.println(str1.equalsIgnoreCase(str4));
	}
}
