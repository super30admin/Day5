class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> h1=new HashMap<>();
        String[] p=s.split(" ");
        
       
        for(int i=0;i<s.length()+1;i++)
        {
            if(h1.containsKey(pattern.charAt(i)))
            {
                if(h1.get(pattern.charAt(i))!=p[i])
                {
                    return false;
                }
            }
            else if (h1.containsValue(p[i]))
                         return false;
 
                
                    h1.put(pattern.charAt(i), p[i]);
         
        }
        return true;
    }
}
