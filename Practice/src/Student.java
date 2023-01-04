
public class Student {
	public String name;
	public Integer age;

	public void printInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student age: " + age);
	}

	public Student(String name, Integer age) {
		// super();
		// TODO Auto-generated constructor stub
//		System.out.println("Constructor called!");
		this.name=name;
		this.age=age;
	}

}
