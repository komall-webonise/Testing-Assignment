package author.komal.java.tests;

import author.komal.java.Subtraction;
import static org.junit.Assert.assertEquals; 
import org.junit.Test;  

public class TestCase1 {

	@Test  
    public void testFindMax(){  
		assertEquals(("When A is 1 and B is 2 the result is -1."),Subtraction.sub("1","2"));    
        assertEquals(("When A is 5 and B is 3i the result is ERROR."),Subtraction.sub("5","3i")); 
        assertEquals(("When A is 2i and B is 5i the result is ERROR."),Subtraction.sub("2i","5i"));  
         
    }  
}
