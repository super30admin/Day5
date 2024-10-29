//49. Group Anagrams - https://leetcode.com/problems/group-anagrams/

//Time Complexity: O(n * k) -> where n -> number of strings in the input * length of each string
//Space Complexity: O(1)
//Prime Product Solution

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> map = new HashMap<>();
        for (String str : strs) {
            double key = calculatePrimeProduct(str);
            // Add the string to the correct list in the map
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private double calculatePrimeProduct(String str) {
        int[] primes = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
        };
        double product = 1;
        for (char c : str.toCharArray()) {
            product *= primes[c - 'a'];
        }
        return product;
    }
}


//Time Complexity: O(n) * (klog(k) + O(k))
//Space Complexity: O(1)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //base case
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            //char to String: to sort characters of each string of the list
            char[] charArr = s.toCharArray();

            Arrays.sort(charArr);
            String sorted = String.valueOf(charArr);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}