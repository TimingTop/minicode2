package com.hrc.minicode.service;

import java.util.List;

import com.hrc.minicode.entity.MyNum;
import com.hrc.minicode.util.MyUtil;

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
     */
    public void testApp()
    {
    	int[] input= {9};
    	List<MyNum> myNums=MyUtil.getDefaultData();
    	List<String> resultLi=MyService.getLetters(myNums, input);
    	String actual="";
    	for(int i=0;i<resultLi.size();i++) {
    		if(i==0) {
    			actual+=resultLi.get(i);
    		}else {
    			actual+=" "+resultLi.get(i);
    		}
    	}
    	System.out.println("actual:"+actual);
    	String expected="w x y z";
    	assertEquals(expected, actual);
    }
}
