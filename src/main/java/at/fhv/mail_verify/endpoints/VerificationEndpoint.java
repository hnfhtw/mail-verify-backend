package at.fhv.mail_verify.endpoints;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class VerificationEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/verify")
	public at.fhv.mail_verify.models.VerResult verify(@org.springframework.web.bind.annotation.RequestParam("mailad") String mailAd, @org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code verify
		System.out.println("Endpoint Reached");
		return at.fhv.mail_verify.handlers.VerificationHandler.getInstance().verify(mailAd, token);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
