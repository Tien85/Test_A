package jUnitTests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;

public class JUpiterTest {

    int testowy = 20;
    String testowyString = "Ala";

    @Test
    @DisplayName("====to jest jupiter===")
    public void jupiterTest() {
        assertTrue(testowy == 20);


    }

}
