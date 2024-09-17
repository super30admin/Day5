// TC- O(n)
// SC- O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> hash1=new HashMap <>();
        
        String arr1[] = s.split(" ");
        if (pattern.length()!=arr1.length){
            return false;
        }
        
        for (int i=0; i<pattern.length(); i++){
            if(!hash1.containsKey(pattern.charAt(i))){
                if(hash1.containsValue(arr1[i])){
                    return false;
                }
                else{
                    hash1.put(pattern.charAt(i),arr1[i]);
                }
                
            }
            if (!hash1.get(pattern.charAt(i)).equals(arr1[i])){
                 return false;
            }
        }
        return true;
        
    }
}
