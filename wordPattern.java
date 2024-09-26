class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] strings=s.split(" ");
        
        
        
        if(pattern.length()==1 && strings.length==1) return true;
        
        if(pattern.length()!=strings.length) return false;
        
        
        HashMap<Character,String> cmap=new HashMap<>();
        HashMap<String,Character> smap=new HashMap<>();
        
        
        
        for(int i=0;i<strings.length;i++)
        {
            char c=pattern.charAt(i);
            if(!cmap.containsKey(c))
            {
                if(smap.containsKey(strings[i])) 
                    return false;
                
                cmap.put(c,strings[i]);
                smap.put(strings[i],c);
            }
            else
            {
                if(!cmap.get(c).equals(strings[i])) return false;
                
                if(!smap.get(strings[i]).equals(c)) return false;
            }
        }
        
        return true;
        
    }
}

//m is average length of strings in s, n is length of pattern
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no