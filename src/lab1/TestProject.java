package lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProject {

	@Test
	public void checkYear(){
		Date d1 = new Date(2009, 7, 25);
		Date d2 = new Date(2010, 7, 25);
		assertEquals(365, d1.daysTo(d2));
	}
	
	@Test
	public void checkMonth(){
		Date d1 = new Date(2016, 12, 22);
		Date d2 = new Date(2016, 10, 23);
		assertEquals(59, d1.daysTo(d2));
	}
	
	@Test
	public void checkGeneral(){
		Date d1 = new Date(2017, 11, 22);
		Date d2 = new Date(2016, 10, 23);
		assertEquals(394, d1.daysTo(d2));
	}
	
	@Test
	public void checkDay(){
		Date d1 = new Date(2016, 10, 27);
		Date d2 = new Date(2016, 10, 23);
		assertEquals(3, d1.daysTo(d2));
	}
	
}
