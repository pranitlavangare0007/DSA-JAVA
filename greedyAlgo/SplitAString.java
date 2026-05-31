package greedyAlgo;

public class SplitAString {
    
    public static int balancedStringSplit(String s) {
        int balance=0;
        int count =0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == 'L'){
                balance++;
            }else{
                balance--;
            }

            if(balance  == 0){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
