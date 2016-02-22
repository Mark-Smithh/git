package test.java;

import org.junit.Assert;
import org.junit.Test;

import com.mark.process.Greeting;

public class GreetingTest {

	@Test
	public void doIt(){
		Greeting greeting = new Greeting(2,"Test");
		Assert.assertNotNull(greeting);		
		Assert.assertEquals(2, greeting.getId());
		Assert.assertTrue(greeting.getContent().equalsIgnoreCase("test"));		
	}
}
