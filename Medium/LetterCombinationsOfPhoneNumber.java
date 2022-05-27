package Medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args){
        letterCombinations("2");
    }

    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < digits.length(); i++){
            int curr = Character.getNumericValue(digits.charAt(i));
            int count = (curr == 9) ? 4 : 3;
            String temp = "";
            for(int j = 0; j < count; j++){
                temp += Character.toString(97 + (curr-2)*3 + j);
                // Just need to figure out when to append the strings
            }
        }

        return result;
    }
}
