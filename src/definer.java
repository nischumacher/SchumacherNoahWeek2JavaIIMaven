import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.defineUtil;

public class definer {

	String term = "Caffiene", definition = "The stuff that allows programmers to keep looking at lines for any amount of time.";
	String message;
	defineUtil definer = new defineUtil(term, definition);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		System.out.println("Inside testSalutationMessage()");
		message = term + " is defined as " +definition;
		assertEquals(message,definer.properlyDefined());
	}

}
