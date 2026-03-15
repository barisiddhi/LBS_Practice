package p;

public class Compnay {
	String cname = "nescoo";
	String aaddress = "Mumbae";
	double salary = 100000;
	
	public Compnay( String cname, String saddress, double sal) {
		this.cname = cname;
		this.aaddress =  saddress;
		this.salary = sal;
	}
	

public static void main(String[] args) {
	 Compnay compnay = new Compnay("abc", "dader", 5000);
	 System.out.println(compnay.cname);
	 System.out.println(compnay.aaddress);
	 System.out.println(compnay.salary);
	 
	
}
}