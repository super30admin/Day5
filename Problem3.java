// Time Complexity : O(n)
// Space Complexity : O(n)

class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] arr = str.split(" ");
        
        if(pattern.length() != arr.length) return false;
        
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++) {
            
            char y = pattern.charAt(i);
            if(map.containsKey(y)) {
                
                if(!map.get(y).equals(arr[i])) {
                    return false;
                }
            } else {
                
                if(map.containsValue(arr[i])) {
                    return false;
                }
                
                map.put(y, arr[i]);
            }
        }
        
        return true;
    }
}