package com.userregistration.com;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Pattern pattern;
    Matcher matcher;


    public boolean checkFirstName(String name) {

    pattern =  Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
    matcher = pattern.matcher(name);
     if(matcher.matches()){
         return true;
     }else {
         return false;
     }
    }

    public boolean checkLastName(String name) {

        pattern =  Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        matcher = pattern.matcher(name);
        if(matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
    @Test
    public void givenLastName_WhenCorrect_ReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.checkLastName("Bavalekar");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenMinimumThreeCharacter_ReturnTrue() {

        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.checkLastName("Bavalekar");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenLowerCase_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.checkLastName("bavalekar");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_WhenAllCaps_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.checkLastName("BAVALEKAR");
        Assert.assertFalse(lastName);

    }

    @Test
    public void givenLastName_WhenContainNumber_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.checkLastName("Bavalekar123");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_WhenSpecialCharacter_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.checkLastName("AK@SHAY");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_WhenMinimumTreeCharacter_ReturnFalse() {

        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.checkLastName("Ak");
        Assert.assertFalse(lastName);
    }
}
