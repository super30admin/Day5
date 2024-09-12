class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s==null || pattern == null)
        {
            return false;
        }
        
        String[] sSep = s.split(" ");
        
        if(sSep.length!=pattern.length())
        {
            return false;
        }
        
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        
        for(int i=0;i<sSep.length;i++)
        {
            char l = pattern.charAt(i);            
            String w = sSep[i];
            
            if(!pMap.containsKey(l))
            {
                pMap.put(l, w);
            }
            if(!sMap.containsKey(w))
            {
                sMap.put(w , l);
            }
            if((!sMap.get(w).equals(l)) || (!pMap.get(l).equals(w)))
            {
                return false;
            }
        }
        return true;
    }
}
//runtime: it takes O(nk) because it takes O(n) to loop through the string and O(k)  for the contains method to check if the woed or letter is present
//space: O(1) becasue the max size of hashmap is going to be 26 letters so it is 2*O(1) which is O(1)
