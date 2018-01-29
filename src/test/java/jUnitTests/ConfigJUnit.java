package jUnitTests;

import org.junit.Before;
import org.junit.BeforeClass;

public class ConfigJUnit {
    @Before
    public void setUp(){

        System.out.println("=========Print Before======");
    }

    @BeforeClass

    public static void init(){
        System.out.println("=========@BewforeClass First JUnit======");
    }

}
