package Reflect;

public class Client {
	public static void main(String[] args) {  
        try { 

            Class clazz = Class.forName("Reflect.Animal");  
            System.out.println("成功加载类文件 "+clazz.getSimpleName());  
        } catch (ClassNotFoundException e) { 
        	System.out.println("没有找到类文件");
            e.printStackTrace();  
        }
	}
}
