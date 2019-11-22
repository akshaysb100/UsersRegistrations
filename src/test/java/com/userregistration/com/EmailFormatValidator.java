package com.userregistration.com;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class EmailFormatValidator {

    private String arg;
    private static UserRegistration userRegistration;
    private Boolean expectedValidation;

    public EmailFormatValidator(String str, Boolean expectedValidation) {
        this.arg = str;
        this.expectedValidation = expectedValidation;
    }

    @BeforeClass
    public static void initialize() {
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { "abc@yahoo.com" , true },
                {"abc.100@yahoo.com",true},
                {"abc.100@abc.com.au",true},
                {"abc+100@gmail.com",true},
                {"abc.abc@gmail.co.in",true},
                {"abc100@gmail.com",true},
                {"abc",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {".abc@abc.com",false},
                {"abc()*@gmail.com",false},
                {"abc@%.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.@g.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@a.com.21a",false},
                {"abc@g.cim.au.au",false}};

        return Arrays.asList(data);
    }


    @Test
    public void test() {

        UserRegistration userRegistration = new UserRegistration();
        Boolean res = userRegistration.validateEmail(this.arg);
        String validv = (res) ? "valid" : "invalid";
        System.out.println("Hex Color Code "+arg+ " is " + validv);
        assertEquals("Result", this.expectedValidation, res);

    }
}