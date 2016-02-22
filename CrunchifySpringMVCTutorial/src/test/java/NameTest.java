package test.java;

import org.junit.Assert;
import org.junit.Test;

import com.mark.process.GetNames;

public class NameTest {
	
	@Test
	public void doIt(){
		GetNames names = new GetNames();
		Assert.assertNotNull(names);
	}

}
