package String;

public class StringTest {

	public static void main(String[] args) {
		/*
		 * String�ǲ���ģ�����sָ��ͬ�Ķ�������HashCode��ͬ
		 * ������������ private final char[] value���棬value������
		 * ��Զ����䣬���ұ�֤char[]�����
		 * 
		 * �������s�Ĳ�����û�б�֤�����Ǹ�Ϊ
		 * final String s = "abc";
		 * ��ô s = "cde" �ͻᱨ��
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
