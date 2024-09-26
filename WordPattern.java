// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String str) 
    {   //making two hashmaps
        HashMap<Character,String> sMap=new HashMap<>();
        HashMap<String,Character> tMap=new HashMap<>();
        //an array is made to store different words in the string str
        String[] s=str.split(" ");//split( , )
        //if number of characters in pattern is not same as the number of words return false
        if(pattern.length()!=s.length) return false;
        //iterating through characters one by one
        for(int i=0;i<pattern.length();i++)
        {   //storing characters in a
            char a=pattern.charAt(i);
            //storing word in s1
            String s1=s[i];
            //if sMap doesn't contain the character put key value pair in hashmap
            if(!sMap.containsKey(a))
            {
                sMap.put(a,s1);
            }
            //if sMap already contains the character,check if the pattern is same if not,return false
            else
            {
                if(!sMap.get(a).equals(s1))
                {return false;}
            }
            //checking same in tMap
            if(!tMap.containsKey(s1))
            {
                tMap.put(s1,a);
            }
            else
            {
                if(!tMap.get(s1).equals(a))
                {return false;}
            }
        }
        
        return true;
    }
}