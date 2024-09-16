//Time Complexity : O(nk log k)
//Space Complexity : O(nk)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //if any strings are not given
        if(strs==null||strs.length==0)
            return new ArrayList<>();
        //initialize the hashMap, with type string and array of strings
        HashMap<String, List<String>> hashMap=new HashMap<>();
        //going through each string in the array of given strings
        //iterating over all the string: O(n)
        for(String eachStr:strs){
            //sort each the characters of the string 
            //iterating over all the characters: O(klogk)
            char[] chars=eachStr.toCharArray();
            Arrays.sort(chars);
            //and convert it to string again.
            String sortedString=String.valueOf(chars);
            //check if the sorted string is already present in the hashmap or not
            if(!hashMap.containsKey(sortedString)){
                //if not present, add the sorted string to the hashMap and create a empty arraylist
                hashMap.put(sortedString,new ArrayList<>());
            }
            //to that arrayList we will add the string
            hashMap.get(sortedString).add(eachStr);
        }
        //return the arrayList with values
        return new ArrayList<>(hashMap.values());
    }
}