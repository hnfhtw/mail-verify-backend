package at.fhv.mail_verify.endpoints;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.mail_verify.models.VerResult;

/**
 * Integration tests for {@link AnalysisEndoint}
 * 
 * @author Michael Sieber
 *
 */
public class VerificationEndpointIT {

	/**
	 * Test analysis with empty text
	 */
	/*@Test
	public void testAnalyzeEmptyText() throws Exception {
		AuthEndpoint authEndpoint = new AuthEndpoint();
		AnalysisEndoint analysisEndpoint = new AnalysisEndoint();
		String token = authEndpoint.login("user@test.com");
		SentimentResult result = analysisEndpoint.analyze("", token);

		Assert.assertNotNull(result);
		Assert.assertEquals("Neutral", result.getSentiment());
		Assert.assertEquals(50.0f, result.getConfidence(), 0);
	}*/

	/**
	 * Test analysis with null text
	 */
	/*@Test
	public void testAnalyzeNullText() throws Exception {
		AuthEndpoint authEndpoint = new AuthEndpoint();
		AnalysisEndoint analysisEndpoint = new AnalysisEndoint();
		String token = authEndpoint.login("user@test.com");
		SentimentResult result = analysisEndpoint.analyze("", token);

		Assert.assertNotNull(result);
		Assert.assertEquals("Neutral", result.getSentiment());
		Assert.assertEquals(50.0f, result.getConfidence(), 0);
	}*/

	/**
	 * Test analysis with empty token
	 */
	/*@Test(expected = Exception.class)
	public void testAnalyzeEmptyToken() throws Exception {
		AnalysisEndoint analysisEndpoint = new AnalysisEndoint();
		analysisEndpoint.analyze("i hate people", "");
	}*/
	
	/**
	 * Test analysis with null token
	 */
	/*@Test(expected = Exception.class)
	public void testAnalyzeNullToken() throws Exception {
		AnalysisEndoint analysisEndpoint = new AnalysisEndoint();
		analysisEndpoint.analyze("i hate people", null);
	}*/
}
