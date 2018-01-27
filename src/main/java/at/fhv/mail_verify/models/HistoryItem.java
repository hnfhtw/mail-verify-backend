package at.fhv.mail_verify.models;

// Start of user code (user defined imports)

// End of user code

public class HistoryItem {
	/**
	 * Description of the property mailad.
	 */
	private String mailad = null;
	
	/**
	 * Description of the property requestdate.
	 */
	private long requestdate = 0;
	
	/**
	 * Description of the property result.
	 */
	public at.fhv.mail_verify.models.VerResult result = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getMailad(){
		   return this.mailad;
		}
		
		public void setMailad(String mailad){
		   this.mailad = mailad;
		}
		
		public long getRequestdate(){
		   return this.requestdate;
		}
		
		public void setRequestdate(long requestdate){
		   this.requestdate = requestdate;
		}
		
		public at.fhv.mail_verify.models.VerResult getResult(){
		   return this.result;
		}
		
		public void setResult(at.fhv.mail_verify.models.VerResult result){
		   this.result = result;
		}
		
	
}
