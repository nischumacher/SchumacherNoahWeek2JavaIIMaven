import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.defineUtil;

public class notANullDefinition {

	String term = "Food", definition = "delicious, or non-delicious, sustenance that is sometimes required for human life.";
	String message;
	defineUtil defined = new defineUtil(term, definition);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Inside testSalutationMessage()");
		message = term + " is defined as " +definition;
		assertNotNull(message,defined.properlyDefined());
	}

}
