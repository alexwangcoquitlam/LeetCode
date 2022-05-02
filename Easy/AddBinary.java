package Easy;

public class AddBinary {
    public static void main(String[] args){
        // #67
        System.out.println(addBinary("11", "1"));
    }

    private static String addBinary(String a, String b){
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        String result = "";
        boolean carry = false;

        int lenA = arrA.length-1; 
        int lenB = arrB.length-1;

        while(lenA >= 0 && lenB >= 0){
            char A = arrA[lenA], B = arrB[lenB];
            if(A == '1' && B == '1'){
                if(carry){
                    result = '1' + result;
                }
                else{
                    result = '0' + result;
                    carry = true;
                }
            }
            else if((A == '1' && B == '0') || (B == '1' && A == '0')){
                if(carry){
                    result = '0' + result;
                }
                else{
                    result = '1' + result;
                    carry = false;
                }
            }
            else if(A == '0' && B == '0'){
                if(carry){
                    result = '1' + result;
                    carry = false;
                }
                else{
                    result = '0' + result;
                }
            }

            lenA--;
            lenB--;
        }
            if(lenA >= 0){
                while(lenA >= 0){
                    char A = arrA[lenA];
                    if(carry){
                        if(A == '1'){
                            result = '0' + result;
                        }
                        else {
                            result = '1' + result;
                            carry = false;
                        }
                    }
                    else{
                        if(A == '1'){
                            result = '1' + result;
                        }
                        else {
                            result = '0' + result;
                        }
                    }
                    lenA--;
                }
            }
            if(lenB >= 0){
                while(lenB >= 0){
                    char A = arrB[lenB];
                    if(carry){
                        if(A == '1'){
                            result = '0' + result;
                        }
                        else {
                            result = '1' + result;
                            carry = false;
                        }
                    }
                    else{
                        if(A == '1'){
                            result = '1' + result;
                        }
                        else {
                            result = '0' + result;
                        }
                    }
                    lenB--;
                }
            }
        

        if(carry){
            result = '1' + result;
        }
        

        return result;
    }
}
