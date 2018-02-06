package at.fhv.mail_verify.models;

// Start of user code (user defined imports)

// End of user code

public class User {
	/**
	 * Description of the property usermail.
	 */
	private String usermail = null;
	
	/**
	 * Description of the property history.
	 */
	private at.fhv.mail_verify.models.History history = null;
	
	/**
	 * Description of the property dumy.
	 */
	public String dumy = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getUsermail(){
		   return this.usermail;
		}
		
		public void setUsermail(String usermail){
		   this.usermail = usermail;
		}
		
		public at.fhv.mail_verify.models.History getHistory(){
		   return this.history;
		}
		
		public void setHistory(at.fhv.mail_verify.models.History history){
		   this.history = history;
		}
		
		public String getDumy(){
		   return this.dumy;
		}
		
		public void setDumy(String dumy){
		   this.dumy = dumy;
		}
		
	
}
