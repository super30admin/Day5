import java.util.*;

//time complexity : O(n + m(log(m))) n=length of strs, m = maximum length string available in strs
//space complexity ; O(m + n)
//I don't face any problems
//runs successfully on leetcode


public class GroupAnagrams49LeetCode {


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();                //creating hashmap

        for(int i=0; i<strs.length; i++){

            char[] charArray = strs[i].toCharArray();               //creating character array from string
            Arrays.sort(charArray);                                 //sort characters
            String sortedString = String.valueOf(charArray);        //making the string from sorted characters
            // System.out.println(sortedString);
            if(!map.containsKey(sortedString)){                     //check if the sortedString key present in map
                map.put(sortedString, new ArrayList<>());           //if not present create key with this string and create arraylist

            }
            List<String> list = map.get(sortedString);
            list.add(strs[i]);                                      //adding original string into list and update the map
            // System.out.println(list);
            map.put(sortedString, list);

        }
        return new ArrayList<>(map.values());                       //returning the map values
    }








//     public List<List<String>> groupAnagrams(String[] strs) {


//         Map<Map<Character, Integer>, List<String>> map = new HashMap<>();

//         for(int i=0; i<strs.length; i++){

//             Map<Character, Integer> frequencyMap = calculateFrequencyMap(strs[i]);

//             if(!map.containsKey(frequencyMap)){
//                 map.put(frequencyMap, new ArrayList<>());
//             }
//             List<String> list = map.get(frequencyMap);
//             list.add(strs[i]);
//             map.put(frequencyMap, list);

//         }

//         return new ArrayList<>(map.values());
//     }

//     public Map<Character, Integer> calculateFrequencyMap(String str){

//         Map<Character, Integer> frequencyMap = new HashMap<>();

//         for(int i=0; i<str.length();i++){

//             char temp = str.charAt(i);
//             if(!frequencyMap.containsKey(temp)){
//                 frequencyMap.put(temp, 1);
//             }
//             else{
//                 frequencyMap.put(temp, frequencyMap.get(temp)+1);
//             }

//         }
//         return frequencyMap;

//     }



//     public List<List<String>> groupAnagrams(String[] strs) {

//         Map<Double, List<String>> map = new HashMap<>();

//         int i = 0;
//         while(i<strs.length){

//             double hashCode = stringHashCode(strs[i]);
//             if(!map.containsKey(hashCode)){
//                 map.put(hashCode, new ArrayList<>());
//             }
//             List<String> temp = map.get(hashCode);
//             temp.add(strs[i]);
//             map.put(hashCode, temp);
//             i++;
//         }
//         return new ArrayList<>(map.values());
//     }

//     public double stringHashCode(String str){

//           int[] primeNumbers={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

//         int i=0;
//         double hashCode = 1;
//         while(i<str.length()){
//             char c = str.charAt(i);
//             hashCode = hashCode * primeNumbers[c-'a'];
//             i++;
//         }
//         return hashCode;
//     }




}
