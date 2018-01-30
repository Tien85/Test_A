package jUnitTests;

import com.jsystems.PhoneValidator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.custom.combined.CombinedParameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.jsystems.PhoneValidator.validatePhoneNumber;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedJUnitTest {

    public PhoneValidator phoneValidator;

    @Test
    @Parameters({"1234567890", "123-456-7890", "123-456-7890", "123 456 7890", "123-456-7123"})
    public void checkIfPhoneCorrect(String phoneNumber) {

        assertTrue(validatePhoneNumber(phoneNumber));
//        assertFalse(phoneValidator.validatePhoneNumber(phoneNumber));


    }

    @Test
    @Parameters({"1234567890", "123-456-7890", "123-456-7890", "123 456 7890", "123-456-7123"})
    public void checkIfPhoneIncorrect(String phoneNumber) {


        assertFalse(phoneValidator.validatePhoneNumber(phoneNumber));


    }

    @Test
    @Parameters({"11@wp.pl", "zula@dd.wep", "fff@sw.pl"})
    public void checkIfEmailValid(String email) {

        assertTrue(phoneValidator.isValidateEmail(email));


    }


    @Test
    @CombinedParameters ({"1,3", "2,4"})
    public void combinedParam(String first, String second) {

        String result = first + second;
        System.out.println(first + "," + second);

        assertTrue(result.contains("1") || result.contains ("3"));
        assertTrue(result.contains("2") || result.contains ("4"));


    }
}
