/**
 * 
 */
package edu.nbcc.factory;

/**
 * @author joeye
 *
 */
public class Admin implements User {

	@Override
	public String getEntitleMents() {
		return "Admin user";
	}

}
