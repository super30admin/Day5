class Solution {
    public boolean isomorphic(String s, String t) {
     if(s.length()!=t.length()){
         return false;
     }

     HashMap<Character, Character> map1 = new HashMap<>();
     HashMap<Character, Character> map2 = new HashMap<>();
     System.out.println(map1);
     for(int i=0; i<s.length(); i++){
         char c1 = s.charAt(i);
         char c2 = t.charAt(i);
          // System.out.println(c1);
         if(map1.containsKey(c1)){
             if(c2!=map1.get(c1)){
                 return false;
             }
         }else{
             if(map2.containsKey(c2)){
                 return false;
             }
              // System.out.println(map1);
             map1.put(c1, c2);
              System.out.println(map1);
             map2.put(c2, c1);
              System.out.println(map2);
         }
     }


     return true;
 }

 }