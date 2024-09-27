// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] animals = s.split(" ");

        if(pattern.length() != animals.length) return false;

        for(int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String animal = animals[i];

            if(map.containsKey(key)) {
                if(!animal.equals(map.get(key))) {
                    return false;
                }
            }
            else {
                if(set.contains(animal)){
                    return false;
                }
            }

            map.put(key, animal);
            set.add(animal);
        }

        return true;
    }
}