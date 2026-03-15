package p;

public class Main1 {
	public String a = "Public ";
	 private String b = "Private";
protected	String c = "Protected ";
	String d = "Default";
	
	public static void main(String[] args) {
		Main1 main1 = new Main1();
		System.out.println(main1.a);
		System.out.println(main1.b);
		System.out.println(main1.c);
		System.out.println(main1.d);
		
	}


}
