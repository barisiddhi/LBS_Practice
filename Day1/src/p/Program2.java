package p;



class Accounts{
	public  void calSal(double sal) {
		System.out.println("Salary of Employee :"+ sal);
	}
	
	
	
	public void  calSal(double sal, double bonus ) {
		System.out.println("Slaray of Manager : "+ sal+ bonus);
	}
}

class Emp extends Accounts {
	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
		super.calSal(sal);
	}
	
	
}
public class Program2 {
	public static void main(String[] args) {
		 Emp emp = new Emp();
		 Accounts accounts = new Accounts();
	accounts.calSal(50000, 10000);
	emp.calSal(300000);
		
	}

}
