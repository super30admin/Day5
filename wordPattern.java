// Time Complexity : O(k) where k is pattern size
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
//use  map to store characters of each string and occurence of 
//their first index. The next time same string occurs compare value
//of map it  should be same else return false
//This works bcs pattern uses char as index of HashMap and string uses string
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map= new HashMap();
        String word[]= s.split(" ");
        if(word.length!=pattern.length())
            return false;
        for(Integer i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            String w= word[i];
            if(!map.containsKey(c))
                map.put(c,i);
            if(!map.containsKey(w))
                map.put(w,i);
            if(map.get(c)!=map.get(w))
                return false;
        }
        return true;
    }
}
