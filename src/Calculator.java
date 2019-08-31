
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println(add(1,2));
System.out.println(multiply(1,2));
System.out.println(divide(1,2));
System.out.println(subtract(1,2));
	}
	
	public static int add(int a,int b){
		return a+b;
		
	}
	
	public static int multiply(int a,int b){
		return a*b;
		
	}
	public static int divide (int a,int b){
		return a/b;
		
	}
	public static int subtract(int a,int b){
		return a-b;
		
	}
}