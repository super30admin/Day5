// Time Complexity: traversing both the strings once and determining if set contains the mapped element which is constant operation - O(n)
// Space Complexity: a new Map and new Set is used but there are only 26 characters which can be kept - O(26) => O(1)
// Did you complete it at leetcode: Yes
// Any problems faced with this question: Understood in class

// Explain your code here
class Solution {
        // Idea is to map each character in first string through the map to each hash of each string in 2nd string.
    // if the mapping is done we add the mapped hash value of 2nd string in set
    // in case any other character comes with another mapping of string, string is not in correct pattern
    public boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        int[] hashes = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {
            hashes[i] = arr[i].hashCode();
        }
        
        for(int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(!map.containsKey(c)) {
                if(set.contains(hashes[i])){
                    return false;
                }
                map.put(c, hashes[i]);
                set.add(hashes[i]);
            } else {
                if(map.get(c) != hashes[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}