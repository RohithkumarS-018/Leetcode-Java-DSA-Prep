import java.util.*;

class Solution {

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            char c = t.charAt(i);

            if (map.containsKey(ch) && map.get(ch) != c) {
                return false;
            }

            if (map1.containsKey(c) && map1.get(c) != ch) {
                return false;
            }

            map.put(ch, c);
            map1.put(c, ch);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(isIsomorphic(s, t));
    }
}