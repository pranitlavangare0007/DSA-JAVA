package greedyAlgo;

public class LargestOddNumberInAString {

     public static String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder(num);

        for(int i=num.length()-1;i>=0;i--){
            char ch=num.charAt(i);
            if(Character.getNumericValue(ch) % 2 != 0){
                return sb.toString();
            }else{
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="4206";
        System.out.println(largestOddNumber(s));
    }
}
