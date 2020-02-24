package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.GoogleTest;
import test.SearchByKeywordTest;

@RunWith(Suite.class)
@SuiteClasses({
	GoogleTest.class,
	SearchByKeywordTest.class,
})
public class TestSuite {
	
}
