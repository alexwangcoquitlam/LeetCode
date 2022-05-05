package Medium;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;

import Easy.LengthOfLastWord;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args){
        // #3
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 0 || s.length() == 1) return s.length();
        int max = 0;
        int counter = 0;
        char[] arr = s.toCharArray();
        HashSet<Character> dictionary = new HashSet<Character>();

        for(int i = 0; i < arr.length;){
            if(!dictionary.contains(arr[i])){
                dictionary.add(arr[i++]);
                max = Math.max(dictionary.size(), max);
            }
            else{
                dictionary.remove(arr[counter++]);
            }
        };
        
        return (dictionary.size() > max) ? dictionary.size() : max;
    }
}
