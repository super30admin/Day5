// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) 
    {   
        //createv two hashmaps
        HashMap<Character,Character> smap=new HashMap<>(); 
        HashMap<Character,Character> tmap=new HashMap<>(); 
        //if length is not equal
        if(s.length()!=t.length()) return false;
        //iterate through the string
        for(int i=0;i<s.length();i++)
        {   //taking characters of both the strings
            char a=s.charAt(i);
            char b=t.charAt(i);
            //if smap doesn't contains a as key
            if(!smap.containsKey(a))//if hashMap doesn't contains a as key
            {   //put a,b as key value pair
                smap.put(a,b);
            }
            //else check if the key present has same value as b
            else
            {//if not, return false
                if(!smap.get(a).equals(b))
                {return false;}
            }
            //in second hashmap,check if it contains b
            if(!tmap.containsKey(b))
            {   //if it doesn't contains b ,put a,b as key value pair
                tmap.put(b,a);
            }
            else
            {// check if the key present has same value as a
                if(!tmap.get(b).equals(a))
                {
                    return false;
                }
            }
        }
        return true;
    }
}