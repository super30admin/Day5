//Time complexity-O(n)
//Space Complexity-O(n)
//Tried one hashmap, but failed for cases like "a" & "a", and "ab" & "ab", so used method taught in class

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        
        HashMap index1=new HashMap<>();
        HashMap index2=new HashMap<>();

        for(Integer i=0;i<s.length();i++)
        {
            if(index1.put(s.charAt(i),i)!=index2.put(t.charAt(i),i))
                return false;
        }
        return true;
        
    }
}
