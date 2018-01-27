package at.fhv.mail_verify.handlers;

// Start of user code (user defined imports)
import org.apache.commons.codec.digest.DigestUtils;
import java.util.HashMap;
import java.util.Map;
// End of user code

public class AuthHandler {
	// Start of user code (user defined attributes)
	protected Map<String, at.fhv.mail_verify.models.User> users = new HashMap<>();
	// End of user code
	

	private static AuthHandler INSTANCE;
	
	private AuthHandler(){
	    // singleton
	}
	
	public static AuthHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new AuthHandler();
	    }
	
	    return INSTANCE;
	}
	
	public void logout(String token) throws Exception {
		// Start of user code logout
		if(token == null || "".equals(token)) {
			throw new Exception("Unknown token");
		}
		users.remove(token);
		// End of user code
	}
	
	public String login(String userMail) throws Exception {
		// Start of user code login
		System.out.println("AuthHandler called with: " + userMail);
		if(userMail == null || "".equals(userMail)) {
			System.out.println("AuthHandler failed");
			throw new Exception("Email must not be empty");
		}
		
		 String token = DigestUtils.md2Hex(userMail);
	        if (!users.containsKey(token)) {
	        	at.fhv.mail_verify.models.User user = new at.fhv.mail_verify.models.User();
	        	user.setUserMail(userMail);
	        	user.setHistory(new at.fhv.mail_verify.models.History());
	          users.put(token, user);
	        }
	        System.out.println("Token = " + token);

	        return token;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	public at.fhv.mail_verify.models.User getUser(String token) throws Exception{
		if(!users.containsKey(token)) {
			throw new Exception("Unknown token");
		}
        return users.get(token);
    }
	// End of user code
	
}
