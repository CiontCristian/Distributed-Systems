/**
 * 
 */
package com.services.axis2server;
import java.io.IOException;
/**
 * @author Cristi
 *
 */
public class TextFileContentRetrieverService {
	public String test() {
		String ret = "This works!";
		
		try {
			return ret;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}
}