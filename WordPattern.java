//Time complexity : O(n)
//Space complexity: O(n)
//Compiled on leetcode.

class Solution {
    public boolean wordPattern(String pattern, String s) {			//Data stored in two hashmaps and for every character on split of string is stored.
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String ,Character> map2 = new HashMap<>();
        String[] str= s.split(" ");
        int i=0;
        if(pattern.length()!=str.length)									//if pattern length and number of words does not match returns false.
            return false;
        while(i<pattern.length())											
        {
            if(!map1.containsKey(pattern.charAt(i)))				//TO check viceversa using 2 hashmaps.
            {
                map1.put(pattern.charAt(i), str[i]);
            }
            if(!map2.containsKey(str[i]))
            {
                map2.put(str[i],pattern.charAt(i));
            }
            if(!(map1.get(pattern.charAt(i)).equals(str[i]) && map2.get(str[i]).equals(pattern.charAt(i))))
            {
                return false;                
            }

            i++;
        }
        
        return true;
    }
}