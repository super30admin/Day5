/*
In this case m and n i.e. lengths of given s and t is going to be same so m == n
Time Complexity: O(m+n) -> O(2n) -> O(n) looping over given s and t in linear time
Space Complexity:  O(m+n) -> O(2n) -> O(n)  looping over given s and t in linear time
*/
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);
            if(indexS != indexT) return false;
            mapS.put(s.charAt(i),i);
            mapT.put(t.charAt(i),i);
        }
        return true;
    }
}