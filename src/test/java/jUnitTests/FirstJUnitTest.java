package jUnitTests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasItem;
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
    public void FirstTest() {
        assertTrue("to jest test", testow == (1 + 1));
        assertTrue(testowy.equals("testowy"));
        assertFalse(false);
        assertThat("to jest test na that", testowy, is("testowy"));
        assertTrue(naszaValue == 15);
        assertThat(testowy2, containsString("testowy"));
        assertThat(testowy, endsWith("y"));
    }


    List<Integer> integery = Arrays.asList(1,2,3,4,5,6);
    List<Integer> integery2 = Arrays.asList(1,2,3,4,5,6);
        @Test
        public void trzeciTest() {
            assertThat(integery, hasItem(5));
            assertThat(integery, hasItem(6));
        }




    @Test
    public void SecondTest(){

        Integer wartoscTestowa = null;
        assertNull(wartoscTestowa);


    }

}
