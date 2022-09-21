package Medium;

import java.util.HashSet;

public class LongestSubstringNoRepeat {
    public static void main(String[] args){
        // #3 Longest Substring Without Repeating Characters
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s){
        HashSet set = new HashSet<Character>();
        int longest = 0;
        int left = 0;
        for(int i = 0; i < s.length();){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(left++));
            }
            else{
                set.add(s.charAt(i++));
                longest = Math.max(longest, set.size());
            } 
        }

        return longest;
    }
}
