//49. Group Anagrams - Passed all test cases
/*
TC: O(n*mlogm)
SC: O(n*m) 
Where n is the length of the array and m is the length of the highest word in the array 
Method: Sort the strings and add them into a hashmap with key as the sorted string and value as the given string. 

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(String st : strs)
        {
            char[] c = st.toCharArray();
            Arrays.sort(c);
            String sortSt = String.valueOf(c);
            if(hm.containsKey(sortSt))
            {
               ArrayList<String> aList = hm.get(sortSt);
                aList.add(st);
                hm.put(sortSt,aList);
            }
            else
            {
                ArrayList<String> aList = new ArrayList<>();
                aList.add(st);
                hm.put(sortSt,aList);
            }
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for(ArrayList<String> s : hm.values())
            res.add(s);
        return res; 
    }
}