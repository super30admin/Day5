import java.util.*;

class Solution {
    
    /** 
     * Problem 1 
     * Time complexity: O(NK) N is size of array and K is size of longest string in array
     * Space compexity: O(NK)
     * Solved on leetcode: Yes
     * 
     * Approach:
     * 1. map the words in lexicographical order
     * 2. maintain the letters and count of those letters in each word and map the words accordingly.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        
        if(strs == null || strs.length == 0)
            return res;
        
        Map<String, List<String>> map = new HashMap<>();
        
        int[] count = new int[26];
        for(String s: strs) {
            Arrays.fill(count, 0);
            for(char c: s.toCharArray()) {
                count[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]);
            }
            String key = sb.toString();
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(s);
            
        }
        
        return new ArrayList(map.values());
        
    }


    /** 
     * Problem 2 
     * Time complexity: O(N)
     * Space compexity: O(1) constant space of two arrays
     * Solved on leetcode: Yes
     * 
     * Approach:
     * Count the occurrence of letter at the particular index position in one string and compare with occurrence of 
     * letter at the same index position in another string.
     */

    public boolean isIsomorphic(String s, String t) {
            
        if((s == null && t == null) || (s.equals("") && t.equals("")))
            return true;
        
        if(s== null || s.equals(""))
            return false;
        
        if(t== null || t.equals(""))
            return false;
        
        if(s.length() != t.length())
            return false;

        int[] sChars = new int[256];
        int[] tChars = new int[256];
        
        for(int i=0; i<s.length(); i++) {
            if(sChars[s.charAt(i)] != tChars[t.charAt(i)])
                return false;
            
            sChars[s.charAt(i)] = i+1;
            tChars[t.charAt(i)] = i+1;
        }
        
        return true;
        
    }

    /** 
     * Problem 3
     * Time complexity: O(N)
     * Space compexity: O(N)
     * Solved on leetcode: Yes
     * 
     * Approach:
     * 1. Map the characters in first string to words in second string.
     * 2. Keep check on the words in second string so that the for same word shouldn't get mapped to 2 differnt characters 
     */
    public boolean wordPattern(String pattern, String str) {
        
        String[] sArr = str.split(" ");
        
        if(pattern.length() != sArr.length)
            return false;
        
        Map<Character, String> map = new HashMap<>();
        Set<String> values = new HashSet<>();
        
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String s = sArr[i];
            
            System.out.println(s +" " + c);
            
            if(map.containsKey(c)) {
                if(!map.get(c).equals(s))
                    return false;
            }
            else {
                if(values.contains(s))
                    return false;
                map.put(c, s);
                values.add(s);
            }
                
        }
        
        return true;
        
    }
}