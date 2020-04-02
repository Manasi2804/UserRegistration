package com.UserRegistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    String COUNTRY_CODE="91";
    String patternForFirstName="^[A-Z]{1}[a-z]{2,}$";
    String patternForLastName="^[A-Z]{1}[a-z]{2,}$";
    String patternFor8characterPassword="^.{8,}";
    String patternForEmailId="^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,4}([.]?[a-z]{2,4})?$";
    String patternForMobileNumber="^"+COUNTRY_CODE+"[ ][9876]{1}[0-9]{9}$";
    String patternForMinimumOneUpperCaseCharacterPassword="[A-Z0-9a-z]*[A-Z][A-Z0-9a-z]*";
    String patternForMinimumOneNumberinCharacterPassword="[A-Z0-9a-z]*[0-9][A-Z0-9a-z]*";
    // Method for matching Regex and input
    public boolean validator(String regexPattern, String input)
    {
        Pattern p = Pattern.compile(regexPattern);
        Matcher matcher = p.matcher(input);
        return matcher.matches();
    }
    // Method for validating first name using Regex
    public boolean validateFirstName(String firstName)
    {
        return validator(patternForFirstName,firstName);
    }
    // Method for validating last name using Regex
    public boolean validateLastName(String lastName)
    {
        return validator(patternForLastName,lastName);
    }
    // Method for validating email ID using Regex
    public boolean validateEmailId(String emailId)
    {
        return validator(patternForEmailId,emailId);
    }
    // Method for validating mobile number using Regex
    public boolean validateMobileNumber(String mobileNumber)
    {
        return validator(patternForMobileNumber,mobileNumber);
    }
    // Method for validating password of minimum 8 characters using Regex
    public boolean isPasswordOfMini8Characters(String password)
    {
        return validator(patternFor8characterPassword,password);
    }
    // Method for validating password of minimum one upper case character using Regex
    public boolean isPasswordOfMinimumUpperCaseCharacter(String password)
    {
        return validator(patternForMinimumOneUpperCaseCharacterPassword,password);
    }
    // Method for validating password of minimum one number in character using Regex
    public boolean isPasswordOfMinimumOneNumberinCharacter(String password)
    {
        return validator(patternForMinimumOneNumberinCharacterPassword,password);
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to user registration");

    }
}