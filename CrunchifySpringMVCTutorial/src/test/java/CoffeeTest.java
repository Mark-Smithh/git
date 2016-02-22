package test.java;

import org.junit.Assert;
import org.junit.Test;

import com.mark.process.Coffee;

public class CoffeeTest {	
	@Test
	public void doIt(){
		Coffee coffee = new Coffee();
		Assert.assertNotNull(coffee);
	}
}
