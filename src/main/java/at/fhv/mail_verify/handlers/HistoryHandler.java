package at.fhv.mail_verify.handlers;

// Start of user code (user defined imports)
import java.time.Instant;
// End of user code

public class HistoryHandler {
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static HistoryHandler INSTANCE;
	
	private HistoryHandler(){
	    // singleton
	}
	
	public static HistoryHandler getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new HistoryHandler();
	    }
	
	    return INSTANCE;
	}
	
	public at.fhv.mail_verify.models.History getHistory(String token) throws Exception {
		// Start of user code getHistory
		if(token == null || "".equals(token)) {
			throw new Exception("Token must not be empty");
		}
		
		at.fhv.mail_verify.models.User user = AuthHandler.getInstance().getUser(token);
		return user.getHistory();
		// End of user code
	}
	
	public void addHistory(String token, String addr, at.fhv.mail_verify.models.VerResult result) throws Exception {
		// Start of user code addHistory
		at.fhv.mail_verify.models.User user = AuthHandler.getInstance().getUser(token);
		at.fhv.mail_verify.models.HistoryItem item = new at.fhv.mail_verify.models.HistoryItem();
    item.setRequestDate(Instant.now().toEpochMilli());
    item.setMailAd(addr);
    item.setResult(result);
    user.getHistory().getItems().add(item);
    
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
