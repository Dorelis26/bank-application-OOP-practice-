package OOP;

class person{
	//blue print from witch we can create any number of people
	String name ;
	String email;
	String phone;
	
	//every person will be able to do the following
	
	void walk() {
		System.out.println(name + "is walking");
	}
	
	void sleep() {
		System.out.println(name + "is sleeping");
	}
	
	void eat() {
		System.out.println(name + "is eating");
	}
	
}

public class demo {
	
	public static void main(String[]args) {
		//instatiating an object
		person person1=new person();
		
		//define some properties
		person1.name = "joe";
		person1.email = "Jdor@gmail.com";
		person1.phone = "1718626789";
		
		
		//abstaction
		person1.eat();
		person1.sleep();
		person1.walk();
		
	
	//person
	
	
	//attributes,variables,adjetives, descriptors
	/*String name = "Jon";
	String email = "Jdor@gmail.com";
	String phone = "1718626789";
	
	//action,activity,behaivior
	
	walk(name);
	//System.out.println(name+" is walking");
	System.out.println(name+" is eating");
	
	}
	
	//enhance by adding fuctions to minimize codo
	
	public static void walk(String name) {
		System.out.println(name+" is walking");
	}*/
	}
}
