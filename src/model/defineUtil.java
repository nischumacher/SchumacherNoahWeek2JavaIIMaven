package model;

public class defineUtil {

	private String message, term, definition, iDa= " is defined as ";
	
	public defineUtil(String term, String definition) {
		this.term = term;
		this.definition = definition;
	}
	
	public String properlyDefined() {
		this.message = this.term + this.iDa + this.definition;
		return message;
	}
	
}
