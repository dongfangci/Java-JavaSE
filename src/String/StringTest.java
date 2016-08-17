package String;

public class StringTest {

	public static void main(String[] args) {
		/*
		 * String是不变的，两次s指向不同的对象，所以HashCode不同
		 * 不变性体现在 private final char[] value上面，value的引用
		 * 永远不会变，并且保证char[]不会变
		 * 
		 * 下面程序s的不变性没有保证，除非改为
		 * final String s = "abc";
		 * 那么 s = "cde" 就会报错
		 * 
		 * 	  value---->Array(char[])	
		 *  /
		 * s
		 *  \
		 *    value---->Array(char[])
		 */
		String s = "abc";
		System.out.println(s.hashCode());
		s = "cde";
		System.out.println(s.hashCode());
		System.out.println(s);
	}

}
