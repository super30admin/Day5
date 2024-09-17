// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double, List<String>> map= new HashMap<>();

        for(String s: strs){
            double calValue=calculateString(s);
            if(!map.containsKey(calValue)){
                map.put(calValue, new ArrayList<>());
            }

            map.get(calValue).add(s);
        }

        return new ArrayList<>(map.values());

    }


    private double calculateString(String s){


        int[] primeKeys={2,3,5,7,11,13,17,19,23,31,37,41,43,47,53,59,61,67,71,73,79,83,87,97,101,103};
        double result = 1;

        for(int i=0; i<s.length(); i++){
            result*=primeKeys[s.charAt(i)-'a'];
        }

        return result;
    }
}