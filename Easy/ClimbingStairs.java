package Easy;

public class ClimbingStairs {
    public static void main(String[] args){
        // #70
        System.out.println(climbStairs(4));
    }

    private static int climbStairs(int n){
        int n1 = 2, n2 = 1, sum = 0;
        if(n <= 2){
            return n;
        }                 
        else{
            for(int i = 2; i < n; i++){
                sum = n1+n2;
                n2 = n1;
                n1 = sum;
            }
        }
        return sum;
    }
}