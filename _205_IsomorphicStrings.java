// space complexity - o(2n)
    	//time - o(n))
      //Ran on leeetcode successfully : Yes
      // Problem faced  : No
    	//Approach : match each charater with other, from s to t and from t to s

       class Solution {

           public boolean isIsomorphic(String s, String t) {

               HashMap<Character, Character> map1 = new HashMap<>();
               HashMap<Character, Character> map2 = new HashMap<>();

               for(int i=0; i<s.length(); i++){
                   Character ch1 = s.charAt(i);
                   Character ch2 = t.charAt(i);

                   if(map1.containsKey(ch1) && map1.get(ch1) != ch2){
                       return false;
                   }
                   if(map2.containsKey(ch2) && map2.get(ch2) != ch1){
                       return false;
                   }

                   map1.put(ch1, ch2);
                   map2.put(ch2, ch1);
               }

               return true;

           }
       }
