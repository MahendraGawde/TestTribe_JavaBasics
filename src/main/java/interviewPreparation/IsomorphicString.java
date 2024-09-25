package interviewPreparation;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "eggbee";
        String t = "addpaa";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        if(s.length()!= t.length()){
            System.out.println("Length not match");
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                if (!hm.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }else {
                    if (hm.containsValue(t.charAt(i))) {
                        return false;
                    }
                    hm.put(s.charAt(i), t.charAt(i));
            }

        }
        return true;
    }
}




