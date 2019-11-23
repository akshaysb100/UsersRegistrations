package com.userregistration.com;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenCorrect_ReturnTrue() {

        boolean firstName = userRegistration.checkFirstName("Akshay");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenMinimumThreeCharacter_ReturnTrue() {

        boolean firstName = userRegistration.checkFirstName("Akshay");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenLowerCase_ReturnFalse() {

        boolean firstName = userRegistration.checkFirstName("akshay");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_WhenAllCaps_ReturnFalse() {

        boolean firstName = userRegistration.checkFirstName("AKSHAY");
        Assert.assertFalse(firstName);

    }

    @Test
    public void givenFirstName_WhenContainNumber_ReturnFalse() {

        boolean firstName = userRegistration.checkFirstName("Akshay123");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_WhenSpecialCharacter_ReturnFalse() {

        boolean firstName = userRegistration.checkFirstName("AK@SHAY");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_WhenMinimumThreeCharacter_ReturnFalse() {

        boolean firstName = userRegistration.checkFirstName("Ak");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenCorrect_ReturnTrue() {

        boolean lastName = userRegistration.checkLastName("Bavalekar");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenMinimumThreeCharacter_ReturnTrue() {

        boolean lastName = userRegistration.checkLastName("Bavalekar");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenLowerCase_ReturnFalse() {

        boolean lastName = userRegistration.checkLastName("bavalekar");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_WhenAllCaps_ReturnFalse() {

        boolean lastName = userRegistration.checkLastName("BAVALEKAR");
        Assert.assertFalse(lastName);

    }

    @Test
    public void givenLastName_WhenContainNumber_ReturnFalse() {

        boolean lastName = userRegistration.checkLastName("Bavalekar123");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_WhenSpecialCharacter_ReturnFalse() {

        boolean lastName = userRegistration.checkLastName("AK@SHAY");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_WhenMinimumTreeCharacter_ReturnFalse() {

        boolean lastName = userRegistration.checkLastName("Ak");
        Assert.assertFalse(lastName);
    }

    // password validation Rule 1

    @Test
    public void givenMobileNumber_WhenPassedValid_ReturnTrue()
    {
        boolean number = userRegistration.checkMobileNumber("91 9876543210");
        Assert.assertTrue(number);
    }

    @Test
    public void givenMobileNumber_WhenNotPassedCountryCode_ReturnFalse()
    {
        boolean number = userRegistration.checkMobileNumber("9876543210");
        Assert.assertFalse(number);
    }

    @Test
    public void givenMobileNumber_WhenNotSeperatedCountryCode_ReturnFalse()
    {
        boolean number = userRegistration.checkMobileNumber("919876543210");
        Assert.assertFalse(number);
    }

    @Test
    public void givenMobileNumber_WhenPassedWithMultipleSpace_ReturnFalse()
    {
        boolean number = userRegistration.checkMobileNumber("91   9876543210");
        Assert.assertFalse(number);
    }


    @Test
    public void givenMobileNumber_WhenPassedLessThanTenNumbers_ReturnFalse()
    {
        boolean number = userRegistration.checkMobileNumber("91 3210");
        Assert.assertFalse(number);
    }

    @Test
    public void givenMobileNumber_WhenPassedOtherThanNumeric_ReturnFalse()
    {
        boolean number = userRegistration.checkMobileNumber("987dasff3213");
        Assert.assertFalse(number);
    }

    @Test
    public void givenPassword_WhenPassword()
    {
        boolean password = userRegistration.checkPassword("AaAaad122ss@aa");
        Assert.assertTrue(password);
    }
}
