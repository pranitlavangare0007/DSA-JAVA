package recursion;

public class NumberTostring {

    static String[] words = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    public static void toString(int n ){
        if (n == 0) {
            return;
        }

      
        toString(n / 10);

       
        int digit = n % 10;
        System.out.print(words[digit] + " ");

    }
    public static void main(String[] args) {
        toString(20160);
    }
}
