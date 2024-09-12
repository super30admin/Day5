#time complexity=O(N)
#space complexity=O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {
            String[] str = s.split(" ");
    
    if(pattern.length()!=str.length)
        return false;
    
    HashMap<Character, String> hm = new HashMap<>();
    
    for(int i=0; i<pattern.length(); i++){
        
        char c = pattern.charAt(i);
        
        if(hm.containsKey(c)){
            
            if(!hm.get(c).equals(str[i]))
                return false;
            
        } else{
            
            if(hm.containsValue(str[i]))
                return false;
            
            hm.put(c, str[i]);
        }
        
    }
    
    return true;
    }
}