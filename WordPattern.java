// Time Complexity : O(n) n is length of the string
// Space Complexity : O(n) - space for map and set
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean wordPattern(String pattern, String s) {

        //regex matches one or more non alphabetic characters
        String[] words = s.split("\\W+");

        //chars and words should be same in number
        if(pattern.length() != words.length)
            return false;

        //map to store char to word mapping
        HashMap<Character, String> map = new HashMap();

        //set to store seen words
        HashSet<String> set = new HashSet();

        for(int i=0; i<pattern.length(); i++)
        {
            char pchar = pattern.charAt(i);

            String word = words[i];

            //if map already contains a char
            if(map.containsKey(pchar))
            {
                //if word mapped to prev char is not same as incoming word
                if(!word.equals(map.get(pchar)))
                    return false;
                //if its same, do nothing
            }

            //map does not contain this char
            else
            {
                //incoming word is already mapped to some other char
                if(set.contains(word))
                    return false;

                 //incoming word is not mapped to some other char
                map.put(pchar, word);
                set.add(word);
            }
        }

        //no false condition has happened
        return true;

    }
}
