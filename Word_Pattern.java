class Solution {
    //Time O(N)
    //Space O(1)
/*
  Intution: As it is a one on one relation we can use HashMap for efficent operations
*/
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || pattern.length() == 0)
        {
            return false;
        }
        String ar[] = s.split(" ");
        if(pattern.length() != ar.length)
        {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for(int i=0 ; i<pattern.length() ; i++)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(ar[i]))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(ar[i]))
                {
                    return false;
                }
                map.put(pattern.charAt(i) , ar[i]);
            }
        }
        return true;
    }
}