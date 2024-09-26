// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//In the code below, we are trying to do a 1-1 mapping for each letter in string pattern to each word in string s in two hashmaps.
//At every iteration , we compare if this 1-1 mapping is maintained and return a false whenever we see a different value in the map compared
//to what the program is reading in string pattern and s.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character , String> pToS = new HashMap<>();
        HashMap<String , Character> sToP = new HashMap<>();
        
        String arrP[] =  s.split(" ");
        if(pattern.length() != arrP.length)
        return false;
        for(int i=0;i<arrP.length;i++)
        {
            
            //for p->s
            if(pToS.containsKey(pattern.charAt(i)) && !(pToS.get(pattern.charAt(i)).equals(arrP[i])))
            {
               return false;
            }
            else
            {
               pToS.put(pattern.charAt(i),arrP[i]);
            }
                                   
            //for s->p
            if(sToP.containsKey(arrP[i]) && !(sToP.get(arrP[i]).equals(pattern.charAt(i))))
            {
               return false;
            }
            else
            {
               sToP.put(arrP[i],pattern.charAt(i));
            }
        }
        return true;
        
    }
}