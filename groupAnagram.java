//for prime product
//Time Complexity: O(NK) 
// Space Complexity:O(NK) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

//for sorting
//Time Complexity: O(NKlogK) 
// Space Complexity:O(NK) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str:strs){
            double primeP = primeProduct(str);
            if(!map.containsKey(primeP)){
                map.put(primeP, new ArrayList<>());
            }
            map.get(primeP).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private double primeProduct(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double result = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result = result*primes[c - 'a'];
        }
        return result;
    }
}

/*class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str:strs){
            char [] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String sorted = String.valueOf(strArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
}*/
