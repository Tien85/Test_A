package jUnitTests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstJUnitTest extends ConfigJUnit {
    @Before
    public void setUp(){

        System.out.println("=========Print Before======");
    }

    @BeforeClass

    public static void init(){
        System.out.println("=========@BewforeClass First JUnit======");
    }

    public int testow = 2;
    public String testowy = "testowy";
    public String testowy2 = "to jest nasz tekst testowy";
    public int naszaValue = 15;

    @Test
    public void FirstTest(){
        assertTrue("to jest test",testow ==(1+1));
        assertTrue(testowy.equals("testowy"));
        assertFalse(false);
        assertThat("to jest test na that", testowy, is( "testowy"));
        assertTrue( naszaValue ==15);
        assertThat(testowy2, containsString("testowy"));
        assertThat(testowy, endsWith("y"));

    }

    @Test
    public void SecondTest(){

        Integer wartoscTestowa = null;
        assertNull(wartoscTestowa);


    }

}
