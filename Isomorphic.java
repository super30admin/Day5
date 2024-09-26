class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap=new HashMap<>();
        HashMap<Character,Character> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(!smap.containsKey(a))
            {
                smap.put(a,b);
            }
            else{
                if(smap.get(a)!=b) return false;
            }
            if(!hmap.containsKey(b))
            {
                hmap.put(b,a);
            }
            else{
                if(hmap.get(b)!=a) return false;
            }
        }
        return true;
    }
}