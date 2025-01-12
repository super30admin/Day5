// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
// Time Complexity :O(n) , n = length of string, iterating over strings
// Space Complexity :keys in hashmap will be 26 itself so its constant, o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO

// Your code here along with comments explaining your approach
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s==null && t ==null) return true;
        if(s==null || t ==null) return false;
        if(s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Character> sMap= new HashMap<>();//search is o(1) mapping of s-t
        HashMap<Character,Character> tMap= new HashMap<>();// mapping of t-s

        for(int i =0; i< s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){// is actually o(1) as working on keys  so it becomes constant, contains method is o(n)
                if(sMap.get(sChar)!= tChar) return false;
            }else{
                sMap.put(sChar,tChar);
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!= sChar) return false;
            }else{
                tMap.put(tChar,sChar);
            }
        }
        return true;

    }
}
