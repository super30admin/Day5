// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : y
// Any problem you faced while coding this : n


class Solution {
    
     public static int uniqueCount(String str){  //function for identifying unique characters in string
          String temp="";
          for (int i = 0; i < str.length(); i++) {
          if(temp.indexOf(str.charAt(i)) == -1 ){
             temp = temp + str.charAt(i);
            }
          }      
         return temp.length();    
      }
     public boolean isIsomorphic(String s, String t) {
        
        if((s.length()==0||s==null) && (t==null||t.length()==0))
        {
            return true;
        }
      int suniquecount= uniqueCount(s);
      int tuniquecount= uniqueCount(t);
      if(suniquecount==tuniquecount){ //if unique count is not different,we will go forward with approach, or else we can return false
          
        char[] sarray = s.toCharArray(); //considered characterarrays instead of hashmaps
        char[] tarray = t.toCharArray();

        int length = sarray.length;
        if(length != tarray.length) return false;

        char[] sm = new char[256];
        char[] tm = new char[256];

        for(int i=0; i<length; i++){
            char sc = sarray[i];
            char tc = tarray[i];
            if(sm[sc] == 0 && tm[tc] == 0){
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
                if(sm[sc] != tc || tm[tc] != sc){
                    return false;
                }
            }
        }
        return true;
      }   
     return false;          
    }
}