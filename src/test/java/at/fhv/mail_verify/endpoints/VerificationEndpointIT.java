package at.fhv.mail_verify.endpoints;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.mail_verify.models.VerResult;

/**
 * Integration tests for {@link AnalysisEndoint}
 * 
 * @author HN
 *
 */
public class VerificationEndpointIT {

	/**
	 * Test verification of empty mail address
	 */
	@Test
	public void testVerifyEmptyMailAddress() throws Exception {
		AuthEndpoint authEndpoint = new AuthEndpoint();
		VerificationEndpoint verEndpoint = new VerificationEndpoint();
		String token = authEndpoint.login("user@test.com");
		VerResult result = verEndpoint.verify("", token);

		Assert.assertNotNull(result);
		Assert.assertEquals(false, result.getResult());
	}

	/**
	 * Test verification of null mail address
	 */
	@Test
	public void testVerifyNullMailAddress() throws Exception {
		AuthEndpoint authEndpoint = new AuthEndpoint();
		VerificationEndpoint verEndpoint = new VerificationEndpoint();
		String token = authEndpoint.login("user@test.com");
		VerResult result = verEndpoint.verify(null, token);

		Assert.assertNotNull(result);
		Assert.assertEquals(false, result.getResult());
	}

	/**
	 * Test verification with empty token
	 */
	@Test(expected = Exception.class)
	public void testVerifyEmptyToken() throws Exception {
		VerificationEndpoint verEndpoint = new VerificationEndpoint();
		verEndpoint.verify("test@asdf.at", "");
	}
	
	/**
	 * Test analysis with null token
	 */
	@Test(expected = Exception.class)
	public void testVerifyNullToken() throws Exception {
		VerificationEndpoint verEndpoint = new VerificationEndpoint();
		verEndpoint.verify("test@asdf.at", null);
	}
}
