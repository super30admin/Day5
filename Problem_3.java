//Time Complexity-O(n)
//Space Complexity-O(n)
//Used a single hashmap instead of classroom approach of 2 hashmaps, learnt about the return value of put statement and compared using indexes of pattern and word

class Solution {
   public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (words.length != pattern.length())
        return false;
    HashMap index = new HashMap<>();
    for (Integer i=0; i<words.length; ++i)
        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
            return false;
    return true;
}
}
