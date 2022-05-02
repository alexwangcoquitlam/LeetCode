package Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // #14
        String[] strings = {"cir", "car"};
        System.out.println("The longest prefix is: \"" + longestCommonPrefix(strings) + "\"");
    }

    private static String longestCommonPrefix(String[] strs){
        char[][] charArray = new char[strs.length][];
        charArray[0] = strs[0].toCharArray();
        int shortest = 0;
        for(int i = 1; i < strs.length; i++){
            charArray[i] = strs[i].toCharArray();
            if (strs[i].length() < strs[shortest].length()){
                shortest = i;
            }
        }
        char[] shortestWord = strs[shortest].toCharArray();
        String longestPrefix = "";
        boolean check = true;

        for(int i = 0; i < shortestWord.length; i++){
            for(int j = 0; j < charArray.length; j++){
                if(j == shortest){}
                else{
                    if(charArray[j][i] != shortestWord[i]){
                        check = false;
                    }
                }
            }
            if(check){
                longestPrefix += shortestWord[i];
            }
            else{
                break;
            }
        }

        return longestPrefix;
    }
}
