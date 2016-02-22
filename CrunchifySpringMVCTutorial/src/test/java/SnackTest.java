package test.java;

import org.junit.Assert;
import org.junit.Test;

import com.mark.process.Snack;

public class SnackTest {	
	@Test
	public void doIt(){
		Snack snack = new Snack();
		Assert.assertNotNull(snack);		
	}
}
