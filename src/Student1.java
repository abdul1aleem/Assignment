
public class Student1 {
int id;
String fristName;
String lastName;
String courseID;
String gender;
static int phoneNumber;

public static void updatePhone(int phone){
	phoneNumber = phone;
	System.out.println(phoneNumber);
}


/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
updatePhone(1232562);
	}

}
