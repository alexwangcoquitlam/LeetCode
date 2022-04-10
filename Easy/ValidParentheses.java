package Easy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String input = keyboard.nextLine();

        System.out.println(isValid(input));
    }

    public static boolean isValid(String s){
        char[] charArr = s.toCharArray();
        boolean isValid = true;
        Stack<Character> stack= new Stack<Character>();
        
        if(charArr.length%2 != 0){
            return false;
        }
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == '(' || charArr[i] == '[' || charArr[i] == '{'){
                stack.push(charArr[i]);
            }
            else{
                if(stack.isEmpty()){
                    isValid = !isValid;
                    break;
                }
                char temp = stack.pop();
                if(temp == '(' && charArr[i] != ')'){
                    isValid = !isValid;
                    break;
                }
                if(temp == '{' && charArr[i] != '}'){
                    isValid = !isValid;
                    break;
                }
                if(temp == '[' && charArr[i] != ']'){
                    isValid = !isValid;
                    break;
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return isValid;
    }
}