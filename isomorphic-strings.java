// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : i have faced some syntax issues later i were able to resolve those


// Your code here along with comments explaining your approach I used two hashmaps to store character mappings, ensuring O(1) key lookups. The time complexity is O(n) since we traverse both strings once, and the space complexity is O(1) because the input consists of only lowercase letters, limiting the hashmap size to a maximum of 26 characters.  

// **Solution 1:** Uses two hashmaps with the same approach as described above.
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        HashMap<Character,Character> sMap = new HashMap<Character,Character>();
        HashMap<Character,Character> tMap = new HashMap<Character,Character>();
        if(sLen != tLen){
            return false;
        }
        for(int i=0;i<sLen;i++){
          char sChar=s.charAt(i);
          char tChar = t.charAt(i);
          if(!sMap.containsKey(sChar)){
            sMap.put(sChar,tChar);
          }else if(sMap.get(sChar) != tChar){
                return false;
            
          }
           if(!tMap.containsKey(tChar)){
            tMap.put(tChar,sChar);
          }else if(tMap.get(tChar) != sChar){
                return false;
            
          }
        }
        return true;
        
    }
}

// solution2 tashmap and hashset 
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

// Your code here along with comments explaining your approach I used one hashmap to store character mappings and a hashset to track mapped characters, both allowing O(1) lookups. The time complexity is O(n) since we traverse both strings once, and the space complexity is O(1) because the input consists of only lowercase letters, limiting the hashmap and hashset to a maximum of 26 characters.  

// **Solution 2:** Uses one hashmap and one hashset with the same approach as described above.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        HashMap<Character,Character> sMap = new HashMap<Character,Character>();
        HashSet<Character> tSet = new HashSet<Character>();
        if(sLen != tLen){
            return false;
        }
        for(int i=0;i<sLen;i++){
          char sChar=s.charAt(i);
          char tChar = t.charAt(i);
          if(!sMap.containsKey(sChar)){
            if(!tSet.contains(tChar)){
               sMap.put(sChar,tChar);
               tSet.add(tChar);
            }
           else{
            return false;
           }
          }else if(sMap.get(sChar) != tChar){
                return false;
            
          }
           
        }
        return true;
        
    }
}