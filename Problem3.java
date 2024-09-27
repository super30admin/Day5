class Solution {

    //Time complexity = O(n)
    //Space complexity = O(M) where M is constant as number of keys will be just 26
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<Character,String>();
        HashMap<String,Character> smap = new HashMap<String,Character>();
        char[] pat = pattern.toCharArray();
        String[] st = s.split(" ");

        if(pat.length!=st.length)
            return false;

        for(int i=0; i<pat.length; i++)
        {
            if(map.containsKey(pat[i]))
            {
                if(!st[i].equals(map.get(pat[i])))
                    return false;
            }
            else
            {
                map.put(pat[i],st[i]);
            }

            if(smap.containsKey(st[i]))
            {
                Character ch = pat[i];
                if(!ch.equals(smap.get(st[i])))
                    return false;
            }
            else
            {
                smap.put(st[i],pat[i]);
            }

        }
        return true;
    }
}