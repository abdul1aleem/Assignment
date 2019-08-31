
public class Employee {

	private double salary;
	public static double netSalary(double salary,float tax){
		salary=salary - (salary*tax/100);
		return salary;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee baba=new Employee();
		
		System.out.println(netSalary(3000,15));
	}

}
