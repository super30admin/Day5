// Time complexity - O(n) - n being the length of the string
// Space complexity - two hashmaps 
// Works on leetcode

class Solution {
    public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> firstMapping = new HashMap<>();
            HashMap<Character, Character> secondMapping = new HashMap<>();

            int len = s.length();
            for(int i =0; i < len; i++){
            //check mapping from from first string to the second
                if (firstMapping.containsKey(s.charAt(i))){
                    if(firstMapping.get(s.charAt(i)) != t.charAt(i)){
                        return false;
                    }
                }
                else {
                    firstMapping.put(s.charAt(i), t.charAt(i));
                }
                
            //check mapping from from second string to the first
                if (secondMapping.containsKey(t.charAt(i))){
                    if(secondMapping.get(t.charAt(i)) != s.charAt(i)){
                        return false;
                    }
                }
                else {
                    secondMapping.put(t.charAt(i), s.charAt(i));
                }
            }
            return true;
    }
}
