// Time Complexity : O(n)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 


import java.util.HashMap;

class Solution {

   public boolean wordPattern(String pattern, String str) {

       String[] arr= str.split(" ");
       int arr_length = arr.length;
       int pattern_length = pattern.length();

       if(arr_length != pattern_length) return false;

       HashMap <Character, String> pMap = new HashMap<Character, String>();

       HashMap <String, Character> sMap = new HashMap<String, Character>();

       for (int i = 0; i <arr_length ; i++){

           char a = pattern.charAt(i);

           if(!pMap.containsKey(a)){

               pMap.put(a,arr[i]);

           } else {

                if (!pMap.get(a).equals(arr[i])) return false;

           }

           if(!sMap.containsKey(arr[i])){

               sMap.put(arr[i],a);

           } else {

               if (!sMap.get(arr[i]).equals(a)) return false;

           }

       }

       return true;

   }

}