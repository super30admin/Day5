//time complexity: O(n), n is num of words
//space complexity:O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap indexMap = new HashMap();

        //get array of words, split by space
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            //add c,index if map does not contain key c
            if (!indexMap.containsKey(c))
                indexMap.put(c, i);

            ////add word,index if map does not contain key word
            if (!indexMap.containsKey(word))
                indexMap.put(word, i);

            //if both key (c and w) exist then check if their values are equal
            if (indexMap.get(c) != indexMap.get(word))
                return false;
        }

        return true;
    }
}