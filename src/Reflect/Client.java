package Reflect;

public class Client {
	public static void main(String[] args) {  
        try { 

            Class clazz = Class.forName("Reflect.Animal");  
            System.out.println("�ɹ��������ļ� "+clazz.getSimpleName());  
        } catch (ClassNotFoundException e) { 
        	System.out.println("û���ҵ����ļ�");
            e.printStackTrace();  
        }
	}
}
