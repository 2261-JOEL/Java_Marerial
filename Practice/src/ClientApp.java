import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {
		

		Pen pen1 = new Pen();
//		pen1.color = "red";
		pen1.type = "gel";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter color: ");
		pen1.color=sc.nextLine();
		Pen pen2 = new Pen();
		pen2.color = "black";
		pen2.type = "ballpoint";

		pen1.write();
//		pen2.write();

//		Student s1 = new Student("Joel", 21);
//		s1.name = "JOel";
//		s1.age = 21;
//		s1.printInfo();
		
		Triangle t1=new Triangle();
		t1.color="red";
	}

}
