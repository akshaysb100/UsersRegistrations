package com.userregistration.com;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenCorrect_ReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.checkFirstName("Akshay");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenMinimumThreeCharacter_ReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.checkFirstName("Akshay");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenLowerCase_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.checkFirstName("akshay");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_WhenAllCaps_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.checkFirstName("AKSHAY");
        Assert.assertFalse(firstName);

    }

    @Test
    public void givenFirstName_WhenContainNumber_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.checkFirstName("Akshay123");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_WhenSpecialCharacter_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.checkFirstName("AK@SHAY");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_WhenMinimumThreeCharacter_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.checkFirstName("Ak");
        Assert.assertFalse(firstName);
    }

}
