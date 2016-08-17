package Reflect;

public class Animal {
	 private Integer age;  
	    private double weight;  
	      
	    public Integer getAge() {  
	        return age;  
	    }  
	  
	    public void setAge(Integer age) {  
	        this.age = age;  
	    }  
	  
	    public double getWeight() {  
	        return weight;  
	    }  
	  
	    public void setWeight(double weight) {  
	        this.weight = weight;  
	    }  
	  
	    public  void walk(){
	    	System.out.println("walk");
	    }  
	    
	    public static void main(String[] args) {
			System.out.println("animal");
		}
}
