/* using map and set -Extra space 
In this iterating on each character of string checking if the curr charcter of s string is mapped or not if 
yes then checking if char at t present in set if yes then returning fasle if no adding that char
to map as key and value as curr index of t string and also adding char at t string in set. if  char in s string is allready mapped 
then checking if it is mapped with char at t string if no returnig false.  */ 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();     //creating map
        Set<Character> set= new HashSet<>();                //creating set
        if(s.length()!=t.length()){                         //checking if the length of both strings is equal
            return false;                                   //if no returning false
        }
        
        for(int i=0; i<s.length();i++){                         //starting loop from any of the string as length is same
            if(map.containsKey(s.charAt(i))){                   //checking if the character of string is mapped 
                if(map.get(s.charAt(i))!=t.charAt(i)){          //if yes then cheking if it is mapped to currrent character
                    return false;                        //if not mapped to current character of another string i.e. t string return fasle
                }
            }else{
                if(set.contains(t.charAt(i))){              //if no checking if the current char of t string is allredy mapped
                    return false;                           //if yes return 
                }
                map.put(s.charAt(i),t.charAt(i));           //adding characters to map 
                set.add(t.charAt(i));                       //and set
                }
          } 
          return true;                                      //if all conditions are satisfied returning true.
     }
             
}

               