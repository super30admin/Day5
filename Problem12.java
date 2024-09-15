class Solution {
      public boolean isomorphic(String str1, String str2) {
         char[] str1Arr = str1.toCharArray();
         char[] str2Arr = str2.toCharArray();
         HashMap<Character,Character> map= new HashMap<Character,Character>();
         for(int i=0; i< str1Arr.length;i++){
             char c1 = str1Arr[i];
             char c2 = str2Arr[i];
             if(map.keySet().contains(c1)){
                 if(map.get(c1).charValue()!=c2) return false;         
             }else{
                 map.put(c1,c2);
             }
          }
          return true;
    }
 }
