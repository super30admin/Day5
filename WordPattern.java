// Time Complexity : O(N) N - number of chars in pattern string
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach
// The basic idea is to maintian a key value mapping for each character in the pattern string and the string in the given string input
// I also used a hashset to store the strings that are already mapped as this helps in avoiding the map.containsValue() check which has O(N) Time complexity
// If there is a mismatch in the pattern and the string return false else return true
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();   

        String[] sArr = s.split(" ");
        if(pattern.length() != sArr.length)
            return false;
        
        for(int i =0; i<pattern.length(); i++) {
            char p = pattern.charAt(i);
            if(!map.containsKey(p)) {
                if(!set.add(sArr[i])) {         // returns false if the element being added is already present in the set else adds the element to the set
                    return false;
                } else {
                    map.put(p, sArr[i]);
                }    
            } else {
                if(!map.get(p).equalsIgnoreCase(sArr[i])) {
                    return false;
                }
            }
        }
        
        return true;
    }
}