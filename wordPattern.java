Time Complexity-O(n)
SpaceComplexity-O(1)

//Leetcode Submission Successful

class Solution {
    public boolean wordPattern(String pattern, String str) {
         String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map m = new HashMap();
        for (int i = 0; i < words.length; ++i) {
            if (m.containsKey(pattern.charAt(i)))
            {
                if (!(m.get(pattern.charAt(i)).equals(words[i]))) 
                    return false;
                
            }
            else 
                if(m.containsValue(words[i]))
                    return false;
                else
                    m.put(pattern.charAt(i),words[i]);
        }
        return true;
    }
    
}
