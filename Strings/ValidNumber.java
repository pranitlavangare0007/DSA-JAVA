package Strings;

public class ValidNumber {

     public static boolean isNumber(String s) {

          return s.matches("[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?");
    }
    public static void main(String[] args) {
        String s= "hvujfhhv";
        System.out.println(isNumber(s));
    }
}
