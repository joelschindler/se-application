/**
 * 
 */
package application;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import application.model.ArticleTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	ArticleTest.class,
})
/**
 * @author Vincent
 *
 */
public class TestSuite2 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println( TestSuite.class.getSimpleName() + ".setUpBeforeClass() called." );
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println( TestSuite.class.getSimpleName() + ".tearDownAfterClass() called." );
	}

	}


