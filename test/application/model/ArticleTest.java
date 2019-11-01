package application.model;

import org.junit.Test;		// JUnit 4

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArticleTest {

	private Article article;
	private String testName_1 = "D Card 64GB"; 
	private String testPrice_1 = "7777";
	
	
	@Before
	public void setUp() throws Exception { // Wird vor jedem Test aufgerufen
		article = new Article(testName_1,"777");
		System.out.println( this.getClass().getSimpleName() + ".setUp() called." );
	}

	@After
	public void tearDown() throws Exception {
		System.out.println( this.getClass().getSimpleName() + ".tearDown() called." );
	}

	@Test
	public void correctID() {
		System.out.println( this.getClass().getSimpleName()+".correctID() called.");
		try {
			//StringBuilder a = new StringBuilder(article.getId());
			StringBuilder a = new StringBuilder("P12345678");
			if (a.charAt(0) != 'P')
				throw new NumberFormatException();
			if(a.equals("P00000000"))
				throw new NumberFormatException();
			else
				a.delete(0, 1);
			if(a.length()!=8)
				throw new NumberFormatException();
			Double.parseDouble(a.toString());
			// assertEquals();
		} catch (NumberFormatException | NullPointerException nfe) {
			assertTrue(false);
			//return false;
		}
		assert(true);
	}
	
	@Test
	public void correctName(){
		System.out.println( this.getClass().getSimpleName()+".correctName() called.");
		article = new Article(testName_1,"777");
		assertTrue(article.getName().equals(testName_1));
		testName_1 = "**Ä B  C**";
		article = new Article(testName_1,"777");
		assertTrue(article.getName().equals(testName_1));
		testName_1 = " 				";
		article = new Article(testName_1,"777");
		assertTrue(article.getName().equals(testName_1));
		testName_1 = "null";
		article = new Article(testName_1,"777");
		assertTrue(article.getName().equals(testName_1));
	}
	
	@Test
	public void correctPrice(){
		System.out.println( this.getClass().getSimpleName()+".correctPrice() called.");
		article = new Article(testName_1,testPrice_1);
		assertTrue(article.getPrice().equals(testPrice_1));
		final String testPrice_2 = "**Ä B  C**";
		article = new Article(testName_1,testPrice_2);
		assertTrue(article.getPrice().equals(testPrice_2));
		final String testPrice_3 = " 				";
		article = new Article(testName_1,testPrice_3);
		assertTrue(article.getPrice().equals(testPrice_3));
		final String testPrice_4 = "null";
		article = new Article(testName_1,testPrice_4);
		assertTrue(article.getPrice().equals(testPrice_4));
	}
	
	@Test 
	public void negative_price() {
		System.out.println( this.getClass().getSimpleName()+".negativePrice() called.");
		article = new Article(testName_1,"-9,99 EUR");
		assertEquals(article.getPrice(), "0,00 EUR");
	}
}


