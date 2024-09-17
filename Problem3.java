/*Algorithm:
    1. Create two hashmaps, Traverse through the pattern. For each character in the patternif the character key is not in the first hashmap, map it with the character respective string element of the string array. Do the vice versa with the other hashmap.
    2. If the character is there in the hashmap then check if the mapped character from hashmap in the other string array is equal to this, If no then return false. Do the vice versa.
    3. After complete traversal of the string length return true.
    
    Time Complexity: O(n)
    Space complexity: O(n) 
    
    Did the problem execute on leetcode successfully? Yes
    
    
*/


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if(pattern.length()!= strArr.length)
            return false;
        Map<Character, String> pMap= new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char a = pattern.charAt(i);
            
            if(!pMap.containsKey(a)){
                pMap.put(a, strArr[i]);
            }
            else{
                if(!pMap.get(a).equals(strArr[i])){
                    return false;
                }
            }
            
            if(!sMap.containsKey(strArr[i])){
                sMap.put(strArr[i], a);
            }
            else{
                if(!sMap.get(strArr[i]).equals(a))
                    return false;
            }
        }
        
        return true;
        
        
    }
}