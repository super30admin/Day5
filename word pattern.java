time complexity: O(n)
space complexity: O(n)

class Solution { //Using two hash table to store the index of each character and word mapping
    public boolean wordPattern(String pattern, String s) {
    char[] chars = pattern.toCharArray(); //converting to char array
    String[] strs = s.split(" "); //splitting the string
    if (chars.length != strs.length) return false; //initial check
    Map<Character, Integer> cmap = new HashMap<>(); 
    Map<String, Integer> smap = new HashMap<>();
    for (Integer i = 0; i < chars.length; i++) { 
        if (cmap.put(chars[i], i) != smap.put(strs[i], i)) // if condition to check 
            return false;
    }
    return true;
    }
}