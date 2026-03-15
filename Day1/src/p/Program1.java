package p;

public class Program1 {
	String name = "tom";
	int id = 5 ;
	static String department = "COMPUTER";
	static String cname = "SDAC";
	static String address = "MUMBAI";
	
	private void displayInfo() {
		
		System.out.println(name);
		System.out.println(id);
	}
public static void main(String[] args) {
Program1 main = new Program1();
	System.out.println(main.id);
	System.out.println(main.name);
	System.out.println(Program1.department);
	System.out.println(Program1.cname);
	System.out.println(Program1.address);
}
}
