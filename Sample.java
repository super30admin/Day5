# Hashing-1

## Problem1 (https://leetcode.com/problems/group-anagrams/)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sMap=new HashMap<>();
        if(strs==null || strs.length==0)
        {
            return new ArrayList<>();
        }
        for(String s: strs)
        {
            char[] charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorted=String.valueOf(charArray);
            if(!sMap.containsKey(sorted))
                sMap.put(sorted,new ArrayList<>());
                sMap.get(sorted).add(s);
        }
        return new ArrayList<>(sMap.values());
    }
}
// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES 
// Any problem you faced while coding this : NO 






## Problem2 (https://leetcode.com/problems/isomorphic-strings/)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==0 || t.length()==0)
            return false;
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char sArr=s.charAt(i);
            char tArr=t.charAt(i);
            if(!sMap.containsKey(sArr))
                sMap.put(sArr,tArr);
            else {
                if(sMap.get(sArr)!=tArr)
                    return false;
            }
            if(!tMap.containsKey(tArr))
                tMap.put(tArr,sArr);
            else 
                if(tMap.get(tArr)!=sArr)
                    return false;
        }
        return true;
    }
}

// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :No






## Problem3 (https://leetcode.com/problems/word-pattern/)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> pMap = new HashMap();
        HashMap <String, Character> sMap = new HashMap();
        String[] sArr = s.split(" ");

        if (sArr.length != pattern.length())
            return false;

        for (int i = 0; i < sArr.length; i++) {
            char c = pattern.charAt(i);
            String w = sArr[i];
            if (!pMap.containsKey(c)) {
                if (sMap.containsKey(w)) {
                    return false;
                } else {
                    pMap.put(c, w);
                    sMap.put(w, c);
                }

            } else {
              
                if (!pMap.get(c).equals(w))
                    return false;
            }
        }

        return true;
    }
}
// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this :NO



