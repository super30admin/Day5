// Before Class Solution

// Time Complexity :O(m*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Using TreeMap of Character key and Integer for occurence of value so for example if the String is "aeda" the TreeMap object will contain {a:2, d:1,e:1}
// Create a Hashmap that will store the above TreeMap as key and ArrayList of String which will have same TreeMap generated 
// So for example the string "for" and "rof" will have same TreeMap object created {f:1, o:1, r:1} so my hashMap will store { {f:1, o:1, r:1} : ["for", "rof"] } 
// Repeat the process till the end of the array and finally loop over the HashMap and return List of List of String 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<TreeMap<Character, Integer>, ArrayList<String>> hashMap = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            TreeMap<Character, Integer> treeMap = new TreeMap<>();
            for(int j = 0;j<strs[i].length();j++){
                if(treeMap.get(strs[i].charAt(j)) == null){
                    treeMap.put(strs[i].charAt(j), 1);
                }else{
                    int currentValue = treeMap.get(strs[i].charAt(j));
                    treeMap.replace(strs[i].charAt(j), currentValue + 1);
                }
            }
            if(hashMap.get(treeMap) == null){
                ArrayList<String> arrList = new ArrayList<>();
                arrList.add(strs[i]);
                hashMap.put(treeMap, arrList);
            }else{
                ArrayList arrList = hashMap.get(treeMap);
                arrList.add(strs[i]);
                hashMap.replace(treeMap, arrList);
            }
        }
        List<List<String>> resList = new ArrayList<>();
        for(Map.Entry<TreeMap<Character, Integer>, ArrayList<String>> hm: hashMap.entrySet()){
            resList.add(hm.getValue());
        }
        return resList;
    }
}