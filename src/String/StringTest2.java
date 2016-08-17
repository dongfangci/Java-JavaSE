package String;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		//true
		System.out.print("s1: " + s1.hashCode());
		System.out.println("  s2: "+s2.hashCode());
		System.out.println(s1 == s2);
		//true
		System.out.println(s1.equals(s2));
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		//false
		System.out.print("s3: " + s3.hashCode());
		System.out.println("  s4: "+s4.hashCode());
		System.out.println(s3 == s4);
		//true
		System.out.println(s3.equals(s4));
	}
	
}
