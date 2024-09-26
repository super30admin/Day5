//205. Isomorphic Strings
//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        if(n!=t.length())
            return false;
        if(n==1)
            return true;
        HashMap<Character,Character> maps2t=new HashMap<>();
         HashMap<Character,Character> mapt2s=new HashMap<>();
        char ch1, ch2;
        for(int i=0;i<n;i++)
        {
            ch1=s.charAt(i);
            ch2=t.charAt(i);
            if(maps2t.containsKey(ch1) ^ mapt2s.containsKey(ch2))
                return false;
            else
            {
                if((maps2t.containsKey(ch1) && maps2t.get(ch1)!=ch2) || (mapt2s.containsKey(ch2) && mapt2s.get(ch2)!=ch1))
                    return false;
                else
                {
                    maps2t.put(ch1,ch2);
                    mapt2s.put(ch2,ch1);
                }
            }
            
        }
        return true;
    }
}