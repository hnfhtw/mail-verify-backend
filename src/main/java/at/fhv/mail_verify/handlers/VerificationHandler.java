package at.fhv.mail_verify.handlers;

// Start of user code (user defined imports)
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
// End of user code

public class VerificationHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static VerificationHandler INSTANCE;
	
	private VerificationHandler(){
	    // singleton
	}
	
	public static VerificationHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new VerificationHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.mail_verify.models.VerResult verif(String mailad, String token) throws Exception {
		// Start of user code verif
		return null;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
