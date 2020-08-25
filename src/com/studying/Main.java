package com.studying;

public class Main {

    public static void main(String[] args) {

        System.out.println("1001 is palindrome : " + isPalindrome("1001"));
        System.out.println("12345 is palindrome : " + isPalindrome("12345"));
        System.out.println("123321 is palindrome : " + isPalindrome("123321"));

        System.out.println("\n");

        System.out.println("The sum of digits 21345 is even : " + isSumEven("21345"));
        System.out.println("The sum of digits 998 is even : " + isSumEven("998"));


    }


    private static boolean  isPalindrome (String numberAsString) {

        char [] chars = numberAsString.toCharArray();
        boolean answer = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i])  answer = false;
        }
        return answer;
    }




    private static boolean isSumEven (String numberAsString) {

        char [] chars = numberAsString.toCharArray();
        boolean answer = true;
        int sum = 0;

        for (int i = 0; i < chars.length; i++)  {
            sum += Character.getNumericValue(chars[i]);
        }

        if (sum % 2 != 0)
            answer = false;

        return answer;
    }


}
