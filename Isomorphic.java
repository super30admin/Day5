//Time complexity O(n) where n is the length of s and t
//Space complexity O(2n) - created two hashmaps
class Solution {
    public boolean isIsomorphic(String s, String t) {
     
        if(s == null || s.length() == 0) return false;
        if(t == null || t.length() == 0) return false;
        if(s.length() != t.length()) return false;
        
        Map<String,String>  map = new HashMap<String,String>();
       
        
        boolean isOK = true;
        for(int index = 0 ;index<s.length();index++){
            String c = s.charAt(index)+"";
            if(map.containsKey(c)){
                if(!map.get(c).equals(t.charAt(index)+"")){
                    isOK = false;
                    break;
                }
            }else{
                map.put(c,t.charAt(index)+"");
            }
            
        }
        if(!isOK)
            return isOK;
        
        Map<String,String> map2 = new HashMap<String,String>();
        for(int index = 0; index < t.length();index++){
            String c = t.charAt(index)+"";
            if(map2.containsKey(c)){
                if(!map2.get(c).equals(s.charAt(index)+"")){
                    isOK = false;
                    break;
                }
            }else{
                map2.put(c,s.charAt(index)+"");
            }
        }
        return isOK;
    }
}
