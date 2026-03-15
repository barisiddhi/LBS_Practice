package p;



public class Program3 {
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
		Program3 emp = new Program3();
		emp.employData(comp_name, department);
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(comp_name);
		System.out.println(department);
		
	}

}

