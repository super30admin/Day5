//Step1 Add charcter of pattern mapped to word in hashmap
//Step 2 if mapping of word is already present and it is not equal to word we are currently at return false , else when traversed whole paatern return true.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map= new HashMap();
        String word[]= s.split(" ");
        
        if(word.length!=pattern.length())
            return false;
        
        for(Integer i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String w= word[i];
            
            if(!map.containsKey(c))
                map.put(c,i);
            if(!map.containsKey(w))
                map.put(w,i);
            
            if(map.get(c)!=map.get(w))
                return false;
        }
        return true;
        
    }
}