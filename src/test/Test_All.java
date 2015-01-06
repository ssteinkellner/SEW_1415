package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		Test_ConnectionHandler.class,
		Test_Tools.class,
		Test_UserCache.class,
		Test_ConsoleWriter.class,
		Test_WriteContainer.class,
		Test_WriteContainer_2.class
	})
public class Test_All {}
