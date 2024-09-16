// tc O(n)
// sc O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashmap = new HashMap<>();
        
        String[] split = s.split(" ");
        char[] patterns = pattern.toCharArray();
        
        if (split.length != pattern.length())
            return false;
        
        for(int i=0;i<patterns.length;i++){
            if(hashmap.containsKey(patterns[i])){
                if(hashmap.get(patterns[i]).equals(split[i])==false)
                    return false;
            }
            else{
                if(hashmap.containsValue(split[i]))
                    return false;
                else
                    hashmap.put(patterns[i], split[i]);
            }
        }
        return true;
    }
}