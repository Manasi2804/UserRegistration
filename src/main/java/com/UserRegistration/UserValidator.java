package com.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateFirstName(String firstName) {
        String patternForFirstName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(patternForFirstName);
        Matcher matcher = p.matcher(firstName);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to user registration");
    }
}