//Sapce Comp- O(1)- since we are always going to have constant no of keys in the hashmap, i.e 26- alphabets, no matter how big the input is

//time Comp-O(n)
//Passed in leetcode-yes
//Issues- no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> hm =new HashMap();    
        HashSet<Character> seen = new HashSet<Character>();
        for(int i=0;i<s.length();i++)//o(n) - go through each char in string
        {
            
            if(!hm.containsKey(s.charAt(i)))//O(1)
               {
                if(!seen.contains(t.charAt(i)))//O(1) //check list of values in set, which are present in hashmap
                {
                    
                   hm.put(s.charAt(i),t.charAt(i));//o(1)
                   seen.add(t.charAt(i));//o(1)
                }
                else{
                    return false;
                }
               }
               else
               {
                   if(hm.get(s.charAt(i)) != t.charAt(i)) //if not equal to what is already added to value list, means wrongly mapped
                   {
                       return false;
                   }
               }
        }
    return true;

        
    }
}