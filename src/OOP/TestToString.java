package OOP;

public class TestToString {

	private String name;
	private int age;
	
	/**
	 * Default Constructor
	 */
	public TestToString(){
		name = "No name yet";
		age = 0;
	}
	
	public TestToString(String name){
		this.name = name;
		age = 0;
	}
	
	public TestToString(int age){
		name = "No name yet";
		this.age = age;
	}
	
	public TestToString(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	@Override
	public String toString(){
		return "Name: "+getName()+"\nAge: "+getAge();
	}
	
	//saying public boolean equals(TestToString object) merely overloads 
	@Override
	public boolean equals(Object otherObject){
		
		//if the current object is compared with itself
		if(this == otherObject)
			return true;
		
		//checks if otherObject is an instance of TestToString
		if( !(otherObject instanceof TestToString))
			return false;
		
		//typecast otherObject to TestToString
		TestToString object = (TestToString) otherObject;
		
		return (this.name.equals(object.name) && this.age == object.age);
	}
	
	public static void main(String args[]){
		
		TestToString testObject = new TestToString("test", 21);
		TestToString test2 = new TestToString("a", 19);
		
		System.out.println(test2.toString());
		System.out.println(test2);
		
		boolean answer = testObject.equals(testObject);
		System.out.println("Are they equal?"+ answer);
	}
			
}
	
	

