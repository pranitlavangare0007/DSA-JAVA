package Strings;

public class AddBinary {
    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i=a.length()-1;
        int j=b.length()-1;

        while(i<=0 && j<=0){
 
        char carry=' ';

        if(a.charAt(i) == '1' && b.charAt(j) == '1'){
            sb.append('0');
            carry='1';
        }else{
            sb.append('0');
        }
        }
       
        return sb.toString();

    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}
