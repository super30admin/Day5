//290. Word Pattern - Passed all test cases
/*
TC: O(n) where n is the length of pattern string
SC: O(k) where k is size of s
Method: Create two hashmaps. If a key exists, compare the value with the corresponding string or character.  If it doesnt match, return false

*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if(pattern.length()!=strArr.length) return false;
        HashMap<Character,String> hm1 = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String str = strArr[i];
            if(hm1.containsKey(c))
            {
                if(!hm1.get(c).equals(str))
                    return false;
            }
            else
            {
                hm1.put(c,str);
            }
            if(hm2.containsKey(str))
            {
                if(hm2.get(str)!=c)
                    return false;
            }
            else
            {
                hm2.put(str,c);
            }
        }
        return true;
        
    }
}