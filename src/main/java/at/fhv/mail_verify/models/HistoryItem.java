package at.fhv.mail_verify.models;

// Start of user code (user defined imports)

// End of user code

public class HistoryItem {
	/**
	 * Description of the property mailAd.
	 */
	private String mailAd = null;
	
	/**
	 * Description of the property requestDate.
	 */
	private long requestDate = 0;
	
	/**
	 * Description of the property result.
	 */
	public at.fhv.mail_verify.models.VerResult result = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getMailAd(){
		   return this.mailAd;
		}
		
		public void setMailAd(String mailAd){
		   this.mailAd = mailAd;
		}
		
		public long getRequestDate(){
		   return this.requestDate;
		}
		
		public void setRequestDate(long requestDate){
		   this.requestDate = requestDate;
		}
		
		public at.fhv.mail_verify.models.VerResult getResult(){
		   return this.result;
		}
		
		public void setResult(at.fhv.mail_verify.models.VerResult result){
		   this.result = result;
		}
		
	
}
