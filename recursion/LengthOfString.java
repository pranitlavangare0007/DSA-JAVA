package recursion;

public class LengthOfString {

    public static int length(String str) {
        if (str.isEmpty())
            return 0;
 
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "string";
        System.out.println(length(str));
    }
}
