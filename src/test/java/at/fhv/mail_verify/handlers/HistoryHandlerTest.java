package at.fhv.mail_verify.handlers;

import org.junit.Assert;
import org.junit.Test;

import at.fhv.mail_verify.handlers.HistoryHandler;

/**
 * Unit tests for {@link HistoryHandler}
 * @author HN
 *
 */
public class HistoryHandlerTest {

	@Test
	public void testSingleton() {
		Assert.assertNotNull(HistoryHandler.getInstance());
	}
}
