package Easy;

import java.util.Arrays;
import java.util.Objects;

public class ValidAnagram {
    // #242
    public static void main(String[] args){
        System.out.println(isAnagram("cat", "act"));
    }

    public static boolean isAnagram(String s, String t){
        char[] sChars = s.toLowerCase().toCharArray();
        Arrays.sort(sChars);
        s = new String(sChars);
        char[] tChars = t.toLowerCase().toCharArray();
        Arrays.sort(tChars);
        t = new String(tChars);

        return Objects.equals(s, t);
    }
}
