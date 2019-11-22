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

    public boolean validateEmail(String email) {

        pattern =  Pattern.compile("^[a-zA-Z0-9]([._+-]{0,1}[a-zA-Z0-9])*[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2}){0,1}$");
        matcher = pattern.matcher(email);
        return matcher.matches();

    }

}
