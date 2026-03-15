package p;



public class p1 {
	String name ;
	int id;
	static String comp_name;
	static	String department;
	
	public void employeInfo( String name, int id) {
		System.out.println("Employee name :"+name);
		System.out.println(" Employee id :"+id);
		
	}
	public static void employData(String comp_name, String department) {
		System.out.println("Employee company :"+comp_name);
		System.out.println("Employee department :"+department);
		
	}
	
	
	public static void main(String[] args) {
		p1 emp = new p1();
		emp.employData(comp_name, department);
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(comp_name);
		System.out.println(department);
		
	}

}

