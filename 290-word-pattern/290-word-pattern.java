class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            
            if(!map.containsKey(pattern.charAt(i)) && !map.containsValue(words[i])){
                
                map.put(pattern.charAt(i), words[i]);
                
            }
            else{
                String key = map.get(pattern.charAt(i));
                if(key== null || !key.equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }
}