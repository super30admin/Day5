// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :  No


// Your code here along with comments explaining your approach

/*

Here we use one to one character mapping using 2 hashmaps . First hashmap for mapping of chars from String s and another for String t

*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null)  return false;
        
        if( s.length() != t.length() ) return false;
        
        char[] strMap = new char[100];
        char[] tArr = new char[100];
        for(int i = 0; i < s.length(); i++){
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            
            if( strMap[sC - ' '] == 0){ // If SC is not stored in array
                strMap[sC - ' '] = tC;
            }
            else{
                if(strMap[sC - ' '] != tC)  return false;
            }
            if(tArr[tC - ' '] == 0 ){
                tArr[tC - ' '] = sC;
            }
            else{
                if(tArr[tC - ' '] != sC)  return false;
            }
            
            
        }
        
        return true;

        
    }
}

public class H1_Problem2{
    public static void main(String[]  args){
        Solution s1 = new Solution();

        System.out.println("Isomorphic ? " + s1.isIsomorphic("efg", "add"));
    }
}

/*

        if(s == null || t == null)  return false;
        
        if( s.length() != t.length() ) return false;
        
        HashMap<Character,Character> strMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            
            if(!strMap.containsKey(sC)){
                strMap.put(sC,tC);
            }
            else{
                if(strMap.get(sC) != tC)  return false;
            }
            
            if(!tMap.containsKey(tC)){
                tMap.put(tC, sC);
            }
            else{
                if(tMap.get(tC) != sC)  return false;
            }
            
        }
        
        return true;


*/