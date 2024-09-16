//TC : O(N) SC : O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] stringArr = s.split(" ");

        if(pattern.length() != stringArr.length)
            return false;

        HashMap<Character,String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();

        int size = pattern.length();

        for(int i=0;i<size;i++)
        {
            char c = pattern.charAt(i);
            if(!hs.contains(stringArr[i]))
                hs.add(stringArr[i]);
            else
            {
                if(hm.get(c)==null || !hm.get(c).equals(stringArr[i]))
                    return false;
            }

            if(hm.containsKey(c))
            {
                if(!hm.get(c).equals(stringArr[i]))
                    return false;
            }
            else
            {
                hm.put(c,stringArr[i]);
            }


        }
        return true;
    }
}