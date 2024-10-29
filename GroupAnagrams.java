// Time Complexity: O(nk) # N is length of strs and  K is the max length of string.
// Space Complexity : O(nk) # store hashvalue of n strings
// Approach : Prime factor method hashing. Map Prime numbers for all 26 characters and create Hash and look for this hash in map 
// and if the same hash exists for string then group them. 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String word: strs){
            double hash = getHash(word);

            if(!map.containsKey(hash)){
                map.put(hash,new ArrayList<>());
            }
            map.get(hash).add(word);
        }

        return new ArrayList<>(map.values());
        
    }

    public double getHash(String word){
        double hash=1;
        int[] prime = {2,3,5,7,9,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        // {'a':2,'b':3.......}
        for(char c: word.toCharArray()){
            hash = hash * prime[c - 'a'];
        }
        return hash;
    }
}


// Time Complexity : n*klogk+ nk = O(nklogk)
// Space Complexity : O(nk)
// Approach : sort the input string and store the sorted string in the map as key and sort the other strings and check in the map if they exists then 
// append those original strings. finally return the map values.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str:strs){

            // convert string to character array
            char[] word =str.toCharArray();

            // sort the arr
            Arrays.sort(word);

            // convert sorted word array to string
            String sortedWord = new String(word);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<String>());
            } map.get(sortedWord).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
}