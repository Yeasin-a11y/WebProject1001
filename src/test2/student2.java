package test2;
class person{
	String name;
	int age;
	void speak( ) {
		System.out.println("My name is:" + name);
	}
	}

public class student2 {
	public static void main(String[] args){
		person person1 =new person();
		person1.name = "Raghib";
		person1.age =25;
		
		person1.speak();
	}
}