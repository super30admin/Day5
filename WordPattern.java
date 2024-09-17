// Time Complexity : O(n)
// Space Complexity : O(m)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// 1. Create two hashmaps, one for mapping characters to words and the other for mapping words to characters
// 2. For every push, check to see if the current value is less than or equal to the top value of the min stack (if it is not empty). The idea is everytime a new minimum is encountered, it is recorded in the min stack
// 3. For removal, remove from the stack and if the value to be removed is equal to the top element of the min stack, remove that value as well as it won't be the accurate min value
// 4. For the top element, return the top element from stack and for min return the top element of min stack


class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap <Character, String> charMap = new HashMap();
        HashMap <String, Character> wordMap = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (!charMap.containsKey(c)) {
                if (wordMap.containsKey(word)) {
                    return false;
                } else {
                    charMap.put(c, word);
                    wordMap.put(word, c);
                }

            } else {
                if (!charMap.get(c).equals(word))
                    return false;
            }
        }

        return true;
    }
}