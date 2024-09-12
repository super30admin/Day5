import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//time complexity : O(n) n=length of pattern
//space complexity ; O(n)
//I don't face any problems
//runs successfully on leetcode



public class WordPattern290LeetCode {




    public boolean wordPattern(String pattern, String s) {

        String[] str  = s.split(" ");                       //creating str array from s
        if(pattern.length() != str.length){                     //if pattern is not equal length of str
            return false;
        }

        Map<Character, String> map = new HashMap<>();                        //creating map
        Set<String> set = new HashSet<>();                               //creating set
        for(int i=0; i<pattern.length(); i++){

            char temp1 = pattern.charAt(i);                             //getting the each character from string pattern
            String temp2 = str[i];                                   //getting the  string str array

            if(!map.containsKey(temp1)){                            //check if character of pattern string is present in map
                if(!set.contains(temp2)){                           //if not then check if  string str is present in set
                    map.put(temp1, temp2);                       //if not then add element in map and set
                    set.add(temp2);
                }
                else{                                             //if character is not present in set then return false
                    return false;
                }
            }
            if(!map.get(temp1).equals(temp2)){                   //if character is present in map, then get the value of that key and compare the value with string
                return false;
            }
        }
        return true;
    }




//     public boolean wordPattern(String pattern, String s) {

//         String[] str = s.split(" ");

//         if(pattern.length() != str.length){
//             return false;
//         }

//         HashMap<Character, String> map1 = new HashMap<>();
//         HashMap<String, Character> map2 = new HashMap<>();

//         int i=0;
//         while(i<pattern.length()){

//             char temp = pattern.charAt(i);
//             if(map1.get(temp)== null){
//                 if(map2.get(str[i])==null){
//                     map1.put(temp, str[i]);
//                     map2.put(str[i], temp);
//                 }
//                 else{
//                     return false;
//                 }
//             }

//             if(!map1.get(temp).equals(str[i])){
//                 return false;
//             }
//             i++;
//         }
//         return true;

//     }
}
