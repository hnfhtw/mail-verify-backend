package at.fhv.mail_verify.models;

// Start of user code (user defined imports)

// End of user code

public class User {
	/**
	 * Description of the property userMail.
	 */
	private String userMail = null;
	
	/**
	 * Description of the property history.
	 */
	private at.fhv.mail_verify.models.History history = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getUserMail(){
		   return this.userMail;
		}
		
		public void setUserMail(String userMail){
		   this.userMail = userMail;
		}
		
		public at.fhv.mail_verify.models.History getHistory(){
		   return this.history;
		}
		
		public void setHistory(at.fhv.mail_verify.models.History history){
		   this.history = history;
		}
		
	
}
