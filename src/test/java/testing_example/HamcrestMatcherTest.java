package testing_example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.everyItem;

public class HamcrestMatcherTest {

	@Test
	public void test_assertthat() {
		List<Integer> scores= Arrays.asList(100,200,214,417);
		
		assertThat(scores,hasSize(4));
        assertThat(scores,hasItems(200,214));
        
}
}
