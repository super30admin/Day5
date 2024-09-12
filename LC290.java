class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> map1 = new HashMap<>();
        
        
        
        String split_str[] = s.split(" ");
        
        if(pattern.length()!=split_str.length)
        {
            return false;
        }
        
        for(int i=0;i<split_str.length;i++)
        {
            char sc = pattern.charAt(i);
            String tc = split_str[i];
            
            if(!map.containsKey(sc))
            {
                map.put(sc,tc);
            }
            else
            {
                System.out.println(sc + ":" +tc);
                
                if(!map.get(sc).equals(tc))
                {
                    return false;
                }
            }
            
            if(!map1.containsKey(tc))
            {
                map1.put(tc,sc);
            }
            else
            {
                System.out.println(tc + ":" +sc);
                
                if(!map1.get(tc).equals(sc))
                {
                    return false;
                }
            }
            
        }
        
        return true;
    }
}