import java.util.HashMap;
import java.util.HashSet;

/*
Time Complexity : O(n)
Space Complexity: O(n)
Run on Leetcode: yes
Any difficulties: No

Approach:
1. In this question, I would be doing one character to other character mapping
2. This means, I will be mapping e->a, g->d and so on,
3. When such mapping comes then the choosing HashMap as the data structure is the best idea,
4. So I will be choosing HashMap for this, and then I will be iterating character to character and will map each character
of the string s to each character of the string t
5. Now when the mapping see an overlap then we would return false, and if this is one to one mapping then we can return
true

 */
public class IsomorphicStrings {

    // Solution which might take O(n^2) because of the containsValue method
    public static boolean isIsomorphicStrings(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if(sArr.length!=tArr.length){
            return false;
        }
        if(s == null && t == null){
            return true;
        }
        if(s== null || t == null){
            return false;
        }

        for(int i = 0; i<sArr.length; i++){
            if(map.containsKey(sArr[i])){
                if(map.get(sArr[i]) == tArr[i]){
                    continue;
                }else{
                    return false;
                }
            } else if(map.containsValue(tArr[i])){
                return false;
            }else{
                map.put(sArr[i], tArr[i]);
            }
        }
        return true;
    }
    // Implementation using HashMap and HashSet

    public static boolean isomorphicStrings(String s, String t){
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(int i = 0; i<sArr.length; i++){
            if(map.containsKey(sArr[i]) && (map.get(sArr[i])!= tArr[i])){
                return false;
            }
            if(!map.containsKey(sArr[i]) && set.contains(tArr[i])){
                return false;
            }

            map.put(sArr[i], tArr[i]);
            set.add(tArr[i]);
        }
    return true;
    }
    public static void main(String[] args){
        System.out.println("Strings are isomorphic: "+ isIsomorphicStrings("egg","add"));
        System.out.println("Strings are isomorphic: "+ isomorphicStrings("egg","add"));
    }
}
