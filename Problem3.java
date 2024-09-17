Time Complexity : O(n)
Space Complexity : O(n)
Runs on LeetCode : NO 

class Solution {
    public boolean wordPattern(String s, String str) {
    if(s.length() != str.length()) {
        return false;
    }

    HashMap<Character, String> h1 = new HashMap<Character, String>();
    HashMap<Character, String> h2 = new HashMap<Character, String>();
String[] result = str.split(" ",2);
    for(int i = 0; i < s.length(); i++) {
        if(h1.get(s.charAt(i))!=null) {
        if(h1.get(s.charAt(i))!=(result[i])) return false;
        }
        else
            h1.put(s.charAt(i),result[i]);
    }
        for(int i = 0; i < str.length(); i++) {
        if(h2.get(result[i])!=null)
        {
        if(h2.get(result[i])!=(s.charAt(i))) return false;
        }
        else
            h2.put((result[i]),(s.charAt(i)));
        }
    return true;
    }
}
   