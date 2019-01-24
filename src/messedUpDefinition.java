import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.defineUtil;

public class messedUpDefinition {//This definition is supposed to fail so that the assertion will work. -Noah Schumacher 11:01PM 1/23/2019
	
	String term = "Food", definition = "delicious, or non-delicious, sustenance that is sometimes required for human life.";
	String message;
	defineUtil foods = new defineUtil(term, definition);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("Inside testSalutationMessage()");
		message = term + definition;
		assertFalse(message.equals(foods.properlyDefined()));
	}

}
