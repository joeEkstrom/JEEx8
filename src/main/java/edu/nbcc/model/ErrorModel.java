/**
 * 
 */
package edu.nbcc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joeye
 *
 */
public class ErrorModel {
	
	private List<String> errors = new ArrayList<String>();

	public ErrorModel() {

	}

	/**
	 * @param errors
	 */
	public ErrorModel(List<String> errors) {
		super();
		this.errors = errors;
	}


	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
}
