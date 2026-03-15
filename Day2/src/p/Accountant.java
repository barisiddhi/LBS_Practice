package p;

class Accountant {
	public void calSal( double salary, double bonus ) {
		System.out.println("salary: "+  salary);
	}

}

class Emp extends Accountant{
	public void calSal(double salary, double bonus) {
		System.out.println("Emnpleyee : "+(salary + bonus));
		
	}
}


 class Manager extends  Accountant{
	 private void calSal(double salary, double bonus, double tax) {
		 System.out.println("Manager: "+ (salary+ bonus- tax));
	}
	 
	 


	
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		Emp emp = new Emp();
		Manager manager = new  Manager();
		accountant.calSal(500, 100);
		emp.calSal(500000, 1000);

		
		
	}
}
