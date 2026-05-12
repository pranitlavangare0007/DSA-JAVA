package Strings;

public class CountSegment {
public static int countSegments(String s) {
           if(s.equals("")){
            return 0;
           }
    String words[]=s.split(" ");
    return words.length;
    }

    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
}
