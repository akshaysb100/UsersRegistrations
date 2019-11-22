package com.userregistration.com;

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
}
