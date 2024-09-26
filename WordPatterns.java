//Time Complexity: O(1)
//Space Complexity:O(n)


//Comparing index of characters and words for both

class Solution {
    public boolean wordPattern(String pattern, String str) {
        char c[] = pattern.toCharArray();
        
        String s[] = str.split(" ");
        
        if(c.length!=s.length)
            return false;
        
        HashMap <Character,Integer> map = new HashMap<Character,Integer>();
        
        HashMap <String,Integer> map2 = new HashMap<String,Integer>();
        
        for(int i = 0; i<c.length;i++)
        {
            int index1= map.getOrDefault(c[i],-1);
            int index2 = map2.getOrDefault(s[i],-1);
            
            if(index1!=index2)
                return false;
            
            map.put(c[i],i);
            map2.put(s[i],i);
            
            
    }
        return true;
    }
