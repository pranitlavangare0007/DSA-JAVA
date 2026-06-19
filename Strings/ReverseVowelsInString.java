package Strings;

public class ReverseVowelsInString {

    static String lowerVowel = "aeiou";
    static String upperVowel = "AEIOU";

    public static String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            ;

            while (i < j && !(arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'e' || arr[i] == 'E' || arr[i] == 'i'
                    || arr[i] == 'I' || arr[i] == 'o' || arr[i] == 'O' || arr[i] == 'u' || arr[i] == 'U')) {
                i++;
            }
            while (i < j && !(arr[j] == 'a' || arr[j] == 'A' || arr[j] == 'e' || arr[j] == 'E' || arr[j] == 'i'
                    || arr[j] == 'I' || arr[j] == 'o' || arr[j] == 'O' || arr[j] == 'u' || arr[j] == 'U')) {
                j--;
            }

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }
        return new String(arr);

    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
