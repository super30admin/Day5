/*
 * 

 *  * T(C) : O(n k log k) n is number of words and k is for letters
 * S(C) : O(n) where n is for number of words
 * 
 * Did it run on Leet code: yes
 * 
 * Pseudocode:
 * 
 * 
 * 1.) Iterate over list of strings
 * 2.) split string into chars then sort chars then put the chars back in 
 * string
 * 3.)  String sorted = String.valueOf(charArr); will make T(C) : k log k where k is number of chars
 * 4.) put inside map the sorted string along with a new array list 
 * 5.)map.get sorted string and add to that the word we are currently processing
 * 6.)return new array list of all the map.get values
 * 
 * */



public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) { if((strs == null) || strs.length == 0) 
            return new ArrayList<>();
                                                            
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str:strs ) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        } 
        return new ArrayList<>(map.values());
    } 
    }