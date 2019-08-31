import org.junit.Test;

//import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

public class TestArraySolution  {
	@Test
	public void checkCountReturnsZeroIfNameNotFound()
	{ 

		String[] myNamesArray = new String[4];
		myNamesArray[0]= "bibi";
		myNamesArray[1]="zara";
		myNamesArray[2]="miya";
		myNamesArray[3]="baba";
		
		int count = ArraySolution.checkNameCount(myNamesArray,"abida");
		
	   System.out.println(count);
	   assertEquals(0, count);
	   
	}
	
	@Test
	public void checkCountReturnsOneIfSingleItem()
	{   
		String[] myNamesArray = new String[4];
	    myNamesArray[0]= "bibi";
	    myNamesArray[1]="zara";
	   myNamesArray[2]="miya";
	    myNamesArray[3]="baba";
	
	int count = ArraySolution.checkNameCount(myNamesArray,"baba");
	
  // System.out.println(count);
   assertEquals(1, count);
		
	}
	
	@Test
	public void checkCountZeroForEmptyArray()
	{   
		
	   	int count = ArraySolution.checkNameCount(null,"baba");
	    assertEquals(0, count);
		
	}
	

	
	
}


