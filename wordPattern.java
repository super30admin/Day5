/*
Runtime complexity : O(N) as we do one pass to iterate the s length.
Space complexity : O(1) as the hashmap and hashset does not occupy more space than 26.
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern==null || s==null)
            return false;
        String[] strArr=s.split(" ");
        if(strArr.length!=pattern.length())
            return false;
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<strArr.length;i++)
        {
            String to_match=strArr[i];
            Character c=pattern.charAt(i);
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(to_match)) // check with the map value to the corresponding string.
                    return false;
            }
            else{
                if(set.contains(to_match)) // before inserting new item to map, check in the set as well.
                    return false;
                map.put(c,to_match);
                set.add(to_match);
            }
        }
        return true;
    }
}
