//TC: O(N) as travelling once;
//SC: O(1) as HashMap only uses 26 alphabets to stre as keys;

//Runnig: Yes, Partially 116 cases passing in Leetcode

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            double count=calcPrimeFactor(strs[i]);
            if(!map.containsKey(count)){
                map.put(count,new ArrayList<>());
            }
            map.get(count).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
    
        private double calcPrimeFactor(String strVal){
            int value=1;
            for(int i=0;i<strVal.length();i++){
                int currVal=strVal.charAt(i);
                value=value*currVal;
            }
            return value;
        }
    
}
