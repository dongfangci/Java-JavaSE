package Scanner;
/*
 * It's because when you enter a number then press Enter, 
 * input.nextInt() consumes only the number, not the "end 
 * of line", primitive data types like int, double etc does
 * not consume "end of line", due which this "end of line"
 * remain in buffer ane When input.next() executes, it 
 * consumes the "end of line" from buffer from the first input. 
 * that's why, your String sentence = scanner.next() only comsume 
 * the "end of line", does not wait to read from keyborad.
 * 
 * 
 * This is a common problem that usually happens when you use 
 * nextLine() method after nextInt() method of Scanner class.

What actually happens is that when the user enters an integer 
at int answer = keyboard.nextInt();, the scanner will take the 
digits only and leave the new-line character \n. So you need to 
do a trick by calling keyboard.nextLine(); just to discard that 
new-line character and then you can call String input = keyboard.nextLine();
 without any problem.
 * */
import java.util.Scanner;

public class Scannertest {
	public static void test1(){
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a sentence:\t");
	        String s1 = scanner.nextLine();

	        System.out.print("Enter an index:\t");		//BugԴ�ڴˣ�nextIntֻ���������֣��������س���������൱�ڽ��س�
	        int index = scanner.nextInt();				//��������һ��s2�У���������취�Ǽ�һ��scanner.nextLine();
	        scanner.nextLine();
	        
	        System.out.print("Enter a sentence:\t");
	        String s2 = scanner.nextLine();

	        System.out.println("Your sentence:\t" + s1);
	        System.out.println("Your index:\t" + index);
	        System.out.println("Your sentence:\t" + s2);
	}
	
	public static void test2(){
		 Scanner scanner = new Scanner(System.in);		//next()�������ں��пո��String���׳��쳣������

	        System.out.print("Enter a sentence:\t");
	        String s1 = scanner.next();

	        System.out.print("Enter an index:\t");		
	        int index = scanner.nextInt();				//������Բ�ʹ��nextLine()����,û��Ӱ�죡
	        scanner.nextLine();
	        
	        System.out.print("Enter a sentence:\t");
	        String s2 = scanner.next();

	        System.out.println("Your sentence:\t" + s1);
	        System.out.println("Your index:\t" + index);
	        System.out.println("Your sentence:\t" + s2);
	}
	public static void test3(){
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext()){
			 StringBuffer sb = new StringBuffer(sc.nextLine());
			 System.out.println(sb);
		 }
	}
	public static void main(String[] args) {
		//test1();
		test2();
		//test3();
	}
}
