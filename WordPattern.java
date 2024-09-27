class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> ch = new HashMap<Character,String>();
        HashMap<String,Character> hc = new HashMap<String,Character>();
        
       
        
        String arr [] = s.split(" ");

        
         if(pattern.isEmpty() || s.isEmpty() || (pattern.length()!=arr.length)) return false;
        
        for(int i =0;i<pattern.length();i++)
        {
            char cha = pattern.charAt(i);   
            if(!(ch.containsKey(cha)))
            {
               ch.put(cha,arr[i]);
            }
            
            if(!(hc.containsKey(arr[i])))
            {
                hc.put(arr[i],cha);
            }
           if(!(ch.get(cha).equals(arr[i]) && hc.get(arr[i]).equals(cha)))
            {
                return false;
            }
        }
        return true;
    }
}