package mx.com.iscrivera;

import javax.xml.bind.JAXBException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws JAXBException 
     */
    public void testApp()
    {
    	String[] args = {"C:\\apps\\report\\detailVeracodeReport.xml"};
		App.main(args);
        assertTrue( true );
    }
}
