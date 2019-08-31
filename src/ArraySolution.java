import java.lang.reflect.Array;


public class ArraySolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] myNamesArray = new String[4];
		myNamesArray[0]= "baba";
		myNamesArray[1]="zara";
		myNamesArray[2]="miya";
		myNamesArray[3]="baba";
		
		int count = checkNameCount(myNamesArray,"baba");
		
	   System.out.println(count);

	}
	
	public static int checkNameCount(String[] names, String name)
	{  if (names==null) return 0;
		
		int count = 0 ;
	   for (int i = 0; i < names.length; i++){
		   if (names[i].equals(name))
			   count++;
	   }
	
		return count;
	}
	
	
			

}
