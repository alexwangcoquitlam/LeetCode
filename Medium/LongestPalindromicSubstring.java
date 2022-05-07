package Medium;

import java.util.HashSet;
import java.util.Stack;

public class LongestPalindromicSubstring {
    public static void main(String[] args){
        // #5
        System.out.println(longestPalindrome("racecarcabbage"));
    }

    public static String longestPalindrome(String s){
        // two cases, palindrome has even letters or palindrome has odd
        if(s.length() == 1 || s.length() == 0){
            return s;
        }
        if(s.length() == 3 && s.charAt(0) == s.charAt(2)){
            return s;
        }
        String longestPalindrome = Character.toString(s.charAt(0));
        String evenPalindrome = "";
        String oddPalindrome = "";
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length-1; i++){
            //a palindrome is half and half, try bruteforcing the other half with every substring
            evenPalindrome = tryPalindrome(arr, i, Math.min(arr.length-1, i+1));
            oddPalindrome = tryPalindrome(arr, i, Math.min(arr.length-1, i+2));

            if(evenPalindrome.length() > longestPalindrome.length()){
                longestPalindrome = evenPalindrome;
            }
            if(oddPalindrome.length() > longestPalindrome.length()){
                longestPalindrome = oddPalindrome;
            }
        }

        return longestPalindrome;
    }

    private static String tryPalindrome(char[] input, int start, int end){
        System.out.println(start + " " + end);
        if(input[start] != input[end]){
            return "";
        }
        String result = "" + input[start] + input[end];
        if((end - start) == 2){
            result = "" + input[start] + input[start+1] + input[end];
        }
        while(start > 0 && end < input.length-1){
            start--;
            end++;
            if(input[start] == input[end]){
                result = input[start] + result + input[end];
            }
            else{
                return result;
            }
        }
        return result;
    }
}
