//Time Complexity: O(N) 
//Space Complexity: O(1)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> sMap = new HashMap<>();
        Map<String, Character> tMap = new HashMap<>();
        
        String arr[] = s.split(" ");
        if(pattern.length() != arr.length)
            return false;
        
        for(int i=0; i<pattern.length(); i++) {
            
            if(!sMap.containsKey(pattern.charAt(i))) {
                sMap.put(pattern.charAt(i), arr[i]);
            }
            
            if(!tMap.containsKey(arr[i])) {
                tMap.put(arr[i], pattern.charAt(i));
            }
            
            if(!sMap.get(pattern.charAt(i)).equals(arr[i]) || tMap.get(arr[i]) != pattern.charAt(i))
                return false;
        }
        return true;
    }
}