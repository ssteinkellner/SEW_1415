package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ssteinkellner.connection.UserCache;

public class Test_UserCache {
	private UserCache uc;

	@Before
	public void setUp() throws Exception {
		uc = new UserCache();
	}
	
	@Test
	public void test_User() {
		String name = "test";
		uc.setUser(name);
		assertEquals(name, uc.getUser());
	}

	@Test
	public void test_Password() {
		uc.setPassword("test");
	}
}
