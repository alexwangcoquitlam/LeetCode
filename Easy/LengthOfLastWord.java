public class LengthOfLastWord {
    public static void main(String[] args){
        // #58
    }

    public static int LengthOfLastWord(String s){
        String[] strArr = s.split("[ ]");
        int length = strArr[strArr.length-1].length();

        return length;
    }

    public static int FasterLengthOfLastWord(String s){
        int length = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else{
                if(length > 0){
                    return length;
                }
            }
        }
        return length;
    }
}
