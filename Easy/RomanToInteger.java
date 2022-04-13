package Easy;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // #13
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String input = keyboard.nextLine();

        System.out.println(romanToInt(input));
    }

    public static int romanToInt(String s) {
        s = s.toUpperCase();
        char[] inputArr = s.toCharArray();
        int length = inputArr.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (inputArr[i] == 'I') {
                if (i != length - 1) {
                    if (inputArr[i + 1] == 'V') {
                        sum += 4;
                        i++;
                    } 
                    else if (inputArr[i + 1] == 'X') {
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }
                } 
                else {
                    sum += 1;
                }
            } 
            else if (inputArr[i] == 'V')
                sum += 5;
            else if (inputArr[i] == 'X') {
                if (i != length - 1) {
                    if (inputArr[i + 1] == 'L') {
                        sum += 40;
                        i++;
                    } else if (inputArr[i + 1] == 'C') {
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }
                } 
                else {
                    sum += 10;
                }
            } 
            else if (inputArr[i] == 'L')
                sum += 50;
            else if (inputArr[i] == 'C') {
                if (i != length - 1) {
                    if (inputArr[i + 1] == 'D') {
                        sum += 400;
                        i++;
                    } else if (inputArr[i + 1] == 'M') {
                        sum += 900;
                        i++;
                    } else {
                        sum += 100;
                    }
                }
                else {
                    sum += 100;
                }
            } 
            else if (inputArr[i] == 'D')
                sum += 500;
            else if (inputArr[i] == 'M')
                sum += 1000;
        }
        return sum;
    }
}