package at.fhv.mail_verify.handlers;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.mail_verify.handlers.VerificationHandler;

/**
 * Unit tests for {@link AnalysisHandler}
 * @author HN
 *
 */
public class VerificationHandlerTest {

	@Test
	public void testSingleton() {
		Assert.assertNotNull(VerificationHandler.getInstance());
	}
}
