// Time Complexity :n(klogk) klogk for sorting n words , by using prime product method it will come to nk
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO

// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // if(strs.length== 1) return strs[0];
        // List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);//klogk
            // sorted is our key
            String sorted = String.valueOf(cArr);//string valueOf() method converts different types of values into string
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            //Trickkk
            map.get(sorted).add(str); // its not else , its like taking that sorted key and adding str to it // it runs all the time

        }
        return new ArrayList<>(map.values());
    }
}

//Prime Products approach

// Time Complexity : O(nK)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> m = new HashMap<>();
        for(String s : strs){
            double prod = checkPrimeProd(s);
            if(!m.containsKey(prod)){
                m.put(prod, new ArrayList<>());
            }
            m.get(prod).add(s);
        }

        return new ArrayList<>(m.values());
        
    }

    private double checkPrimeProd(String s){
         int [] prime = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,73,79,83,89,97,101,103};// initiazed up , so new method can also access it.
        double res = 1;// it should be 1 kept 0 which is wrong
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            res = res * prime[c - 'a'];
        }
        return res;
         



    }
}
