
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(average(10,30,60));
		System.out.println(inputName("baba"));
	}
	

	public static String average (int a,int b, int c){
		int average = (a+b+c)/3;
		if(average <50)
			return "fail";
		else
			return "pass";
	}
	
	public static String inputName(String name){
		return name;
	}

}