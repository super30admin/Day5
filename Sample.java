//Group Anagrams
// Time Complexity : O(n*l)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this:no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs.length==0 || strs== null)
       {
           return new ArrayList<>();
       }
        HashMap<Long, List<String>> hp=new HashMap<>();
        for (int i=0;i<strs.length;i++)
        {
            long val= calcprime(strs[i]);
            if(!hp.containsKey(val))
            {
                hp.put(val, new ArrayList<>());
            }
            hp.get(val).add(strs[i]);
        }
        return new ArrayList<>(hp.values());
        
    }
    
    private long calcprime(String str)
    {
        long result=1;
        int[] primearray = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i=0;i< str.length();i++)
        {
            char ch = str.charAt(i);
            result=result * primearray[ch-'a'];
        }
        return result;
    }
}
//Word Pattern


class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs= str.split(" ");
        int psize=pattern.length();
        int ssize= strs.length;
        if(psize != ssize)
        {
            return false;
        }
        HashMap<Character, String> pmap= new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        for(int i=0;i< ssize;i++)
        {
            char pchar= pattern.charAt(i);
            if(!pmap.containsKey(pchar))
            {
                pmap.put(pchar,strs[i]);
            }
            else
            {
                if(!pmap.get(pchar).equals(strs[i]))
                    return false;
            }
            if(!smap.containsKey(strs[i]))
            {
                smap.put(strs[i],pchar);
            }
            else
            {
                if(!smap.get(strs[i]).equals(pchar))
                    return false;
            }
            
        }
        return true;
    }
}

//ISomorphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
         //String[] strs= str.split(" ");
        int ssize=t.length();
        int tsize= s.length();
        if(ssize != tsize)
        {
            return false;
        }
        HashMap<Character, Character> smap= new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i=0;i< ssize;i++)
        {
           char schar= s.charAt(i);
           char tchar=t.charAt(i);
            if(!smap.containsKey(schar))
            {
                smap.put(schar,tchar);
            }
            else
            {
                if(!smap.get(schar).equals(tchar))
                    return false;
            }
            if(!tmap.containsKey(tchar))
            {
                tmap.put(tchar,schar);
            }
            else
            {
                if(!tmap.get(tchar).equals(schar))
                    return false;
            }
            
        }
        return true;
    }
}

