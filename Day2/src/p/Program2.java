package p;

public class Program2 {
	String cname = "nescoo";
	String aaddress = "Mumbae";
	double salary = 100000;
	
	public Program2( String cname, String saddress, double sal) {
		this.cname = cname;
		this.aaddress =  saddress;
		this.salary = sal;
	}
	

public static void main(String[] args) {
	 Program2 compnay = new Program2("abc", "dader", 5000);
	 System.out.println(compnay.cname);
	 System.out.println(compnay.aaddress);
	 System.out.println(compnay.salary);
	 
	
}
}