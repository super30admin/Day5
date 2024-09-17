class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        if(pattern.length() != strArray.length)
            return false;
        
        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String str = strArray[i];
            
            if(pmap.containsKey(pChar)){
                if(!str.equals(pmap.get(pChar)))
                    return false;
            }
            else
                pmap.put(pChar, str);
            
            if(smap.containsKey(str)){
                if(smap.get(str) != pChar)
                    return false;
            }
            else
                smap.put(str, pChar);
        }
        return true;
    }
}

//TC : O(nk)
//SC : O(nk)