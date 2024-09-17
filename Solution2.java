//Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

public class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> map = new HashMap<>();
        //stores mapped values
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            //mapping does not exist
            if(!map.containsKey(schar))
            {
            // the mapping value already been used
                if(set.contains(tchar))
                    return false;
                
                map.put(schar,tchar);
                set.add(tchar);
            }
            else
            //mapping exists
            {
                //not mapped to correct value
                if(map.get(schar)!=tchar)
                    return false;
                //if mapped , its corresponsing mapped value shouled exist in hashset
                if(!set.contains(map.get(schar)))
                    return false;
            }
            
        }
            
        return true;
}
    
}
