package anand;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {

	@Test
	public void test() {
		Test1 t=new Test1();
		String expected ="madam";
		String actual =t.palindrome(expected);
		
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		System.out.print("test 2");
		Assert.assertEquals("Anand","anand");
		
	}

}
