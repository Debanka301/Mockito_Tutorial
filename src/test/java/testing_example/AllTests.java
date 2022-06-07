package testing_example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StringHelperParameterized.class, StringHelperTest.class })
public class AllTests {

}
