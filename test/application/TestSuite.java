package application;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


import application.model.Article;
import application.model.CustomerTest;

/**
 * JUnit TestSuite.
 * 
 * @author sgra64
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CustomerTest.class,
})
public class TestSuite {
	
	

	/**
	 * Setup method invoked before test classes in test suite are executed.
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println( TestSuite.class.getSimpleName() + ".setUpBeforeClass() called." );

		 //article = new Article("test","777");	// Object is being created before each and every @test 
	}

	/**
	 * Tear-down method invoked after test classes in test suite have finished.
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println( TestSuite.class.getSimpleName() + ".tearDownAfterClass() called." );
	}
	 
	   
	}


