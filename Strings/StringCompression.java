package Strings;

public class StringCompression {

    public static int compress(char[] chars) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {

            Integer couunt = 1;
            while(i<chars.length-1 && chars[i] == chars[i+1]){

                couunt++;
                i++;
            }
            newStr.append(chars[i]);
            if(couunt > 1){
                newStr.append(couunt);
            }
        }
        for(int i=0;i<newStr.length();i++){
            chars[i]=newStr.charAt(i);
            System.out.print(chars[i]+" ");
        }
        
        System.out.println();
        return newStr.length();

    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'a', 'b', 'b' };
        System.out.println(compress(chars));
    }

}
