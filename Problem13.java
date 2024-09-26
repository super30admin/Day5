// Time Complexity : O(n)
// Space Complexity : O(n) because the given the problem Hashmap will store constant letters which are bounded.

// Approach:
//     split the string based on space delimiter
//     Check the pattern length with the string array length.
//     Create 2 Hashmaps and add corresponding character of pattern as key & ith element of array value.
//     Repeat this process for second hashmap & add ith element of array as key & each char of pattern as value
//     Check if there is a match in Map otherwise return false


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] input = str.split(" ",-1);
        
        if(pattern.length() != input.length) return false;
            
        Map<Character, String> hm = new HashMap<>();
        Map<String, Character> hm2 = new HashMap<>();
        
        for(int i = 0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(!hm.containsKey(c)){
                hm.put(c, input[i]);
            } else{
                if(!hm.get(c).equals(input[i])) return false;
            }
            
            if(!hm2.containsKey(input[i])){
                hm2.put(input[i],c);
            } else{
                if(!hm2.get(input[i]).equals(c)) return false;
            }
        }
        return true;
    }
}