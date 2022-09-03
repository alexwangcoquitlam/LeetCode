package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class GroupAnagrams {
    public static void main(String[] args) {
        // #49 Group Anagrams
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(strs);
        System.out.println("pause");
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            char[] tempArr = strs[i].toCharArray();
            Arrays.sort(tempArr);
            String temp = String.valueOf(tempArr);
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<String>());
                map.get(temp).add(strs[i]);
            }
            else{
                map.get(temp).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());
    }
}
