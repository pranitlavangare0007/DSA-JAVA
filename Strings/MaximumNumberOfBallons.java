package Strings;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallons {
    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {
            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        }

        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);

        return Math.min(
                Math.min(b, a),
                Math.min(Math.min(l, o), n));
    }

    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println(maxNumberOfBalloons(text));
    }
}
