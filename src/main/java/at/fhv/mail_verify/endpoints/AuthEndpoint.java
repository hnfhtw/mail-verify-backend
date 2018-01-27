package at.fhv.mail_verify.endpoints;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class AuthEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.PostMapping("/login")
	public String login(@org.springframework.web.bind.annotation.RequestParam("usermail") String usermail) throws Exception {
		// Start of user code login
		System.out.println("Login Request received with: " + usermail);
		return at.fhv.mail_verify.handlers.AuthHandler.getInstance().login(usermail);
		// End of user code
	}
	
	@org.springframework.web.bind.annotation.PostMapping("/logout")
	public void logout(@org.springframework.web.bind.annotation.RequestParam("token") String token) throws Exception {
		// Start of user code logout
		at.fhv.mail_verify.handlers.AuthHandler.getInstance().logout(token);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
