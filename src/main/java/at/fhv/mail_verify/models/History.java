package at.fhv.mail_verify.models;

// Start of user code (user defined imports)

// End of user code

public class History {
	/**
	 * Description of the property items.
	 */
	private java.util.List<at.fhv.mail_verify.models.HistoryItem> items = new java.util.ArrayList<at.fhv.mail_verify.models.HistoryItem>();
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public java.util.List<at.fhv.mail_verify.models.HistoryItem> getItems(){
		   return this.items;
		}
		
		public void setItems(java.util.List<at.fhv.mail_verify.models.HistoryItem> items){
		   this.items = items;
		}
		
	
}
