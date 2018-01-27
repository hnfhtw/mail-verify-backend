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
	
	public at.fhv.mail_verify.models.VerResult verify(String mailAd, String token) throws Exception {
		// Start of user code verify
		if(token == null || "".equals(token)) {
			throw new Exception("Not authenticated");
		}
		
		if(mailAd == null || "".equals(mailAd)) {
			at.fhv.mail_verify.models.VerResult empty = new at.fhv.mail_verify.models.VerResult();
			empty.setResult(false);
			return empty;
		}
		
		String sURL = "http://apilayer.net/api/check?access_key=" + System.getenv("MAILBOXLAYER_API_KEY") + "&email=" + mailAd + "&smtp=1&format=1";
		
		HttpResponse response = Request.Post(sURL).execute().returnResponse();
		String result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
		Gson gson = new GsonBuilder().create();
		JsonObject jsonObject = gson.fromJson(result, JsonObject.class);
		
		boolean bMailValid = gson.fromJson(jsonObject.get("smtp_check"),	Boolean.class);
				
		at.fhv.mail_verify.models.VerResult verificationResult = new at.fhv.mail_verify.models.VerResult();

    if(bMailValid == true){
      verificationResult.setResult(true);
    }
    else{
      verificationResult.setResult(false);
    }
		
		HistoryHandler.getInstance().addHistory(token, mailAd, verificationResult);
		return verificationResult;
        
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
