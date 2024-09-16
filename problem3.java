// https://leetcode.com/problems/word-pattern/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: Initially I wasn't aware of the following function - containsValue 

public class problem3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] list = s.split(" ");
        if (list.length != pattern.length())
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsValue(list[i]) && !map.containsKey(pattern.charAt(i))) {
                return false;
            } else if (map.get(pattern.charAt(i)) == null) {
                map.put(pattern.charAt(i), list[i]);
            } else if (!Objects.equals(map.get(pattern.charAt(i)), list[i])) {
                return false;
            }
        }
        return true;
    }
}
