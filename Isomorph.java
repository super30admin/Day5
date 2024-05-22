import java.util.*;
public class Isomorph {
        public boolean isIsomorphic(String s, String t) {
            if((s.length() != t.length()) || (s == null || t == null || s.length() == 0|| t.length() == 0)) {
                return false;
            }
            // HashMap<Character, Character> sMap = new HashMap<>();
            // HashMap<Character, Character> tMap = new HashMap<>();
            // HashSet<Character> set = new HashSet<>();
            int[] sMap = new int[256];
            Arrays.fill(sMap, -1);
            int[] tMap = new int[256];
            Arrays.fill(tMap, -1);
            for(int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if(sMap[sChar] != -1) {
                    if(sMap[sChar] != tChar) {
                        return false;
                    }
                }
                else {
                    sMap[sChar] = tChar;
                }
                if(tMap[tChar] != -1) {
                    if(tMap[tChar] != sChar) {
                        return false;
                    }
                }
                else {
                    tMap[tChar] = sChar;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            Isomorph isomorph = new Isomorph();
            System.out.println(isomorph.isIsomorphic("aba", "cba"));
        }
    }

