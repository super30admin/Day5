class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> hmap = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] sa = s.split(" ");
        
        if(pattern.length() != sa.length)
            return false;
        
        for(int i=0; i<sa.length; i++)
        {
            char a = pattern.charAt(i);
            String b = sa[i];
            
            if(!hmap.containsKey(a))
            {
                if(set.contains(b))
                    return false;
                hmap.put(a,b);
                set.add(b);
            }
            else
            {
                if(!b.equals(hmap.get(a)))
                    return false;
            }
        }
        
        return true;
    }
}

// TC- O(N)
//SC- O(N)
/*
- Split s
- Use hashmap to store corresponding character and string
- Hashset to store visited strings- ones that already have a corresponding character in pattern
*/
