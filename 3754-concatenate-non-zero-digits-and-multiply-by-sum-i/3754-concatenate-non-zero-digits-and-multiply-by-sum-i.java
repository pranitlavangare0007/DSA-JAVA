class Solution {
    public long sumAndMultiply(int n) {
        long newNum=0;
        long sum=0;

        while(n != 0){
            int digit = n % 10;
             n /= 10;
            if(digit == 0){
                continue;
            }
            newNum = newNum * 10 + digit;
            sum += digit;
           
        }
         String reversedStr = new StringBuilder(String.valueOf(newNum)).reverse().toString();
        long reversed = Long.parseLong(reversedStr);
        return sum*reversed;
    }
}