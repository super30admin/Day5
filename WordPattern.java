// Time Complexity : O(nk) where n 
// Space Complexity : O(k) where k is the size of unique words in s
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

class WorPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null && s == null) return true;
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        
        Map<Character, String> map = new HashMap();
        Set<String> set = new HashSet();
        
        for(int i=0; i<str.length;i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(set.contains(str[i])) return false;
                else {
                    map.put(pattern.charAt(i),str[i]);
                    set.add(str[i]);
                }
            }else{
                if(!map.get(pattern.charAt(i)).equals(str[i])) return false;
            }
        }
        
        return true;
        
    }
}