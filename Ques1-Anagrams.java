// Time Complexity : O(NKLogK) - N is the number of strings and k is worst case length of a string. To sort
// it takes KlogK
// Space Complexity : O(NK) - N Strings and assuming K characters of each of those strings
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
// For each the input strings convert it into a character array.
// Sort this character array and let the string formed by the sorted characters be a unique key to
// Identify anagrams. All anagrams will go in the same bucket of key and ArrayList.
// Lastly Add all the values in the ans.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hmap = new HashMap<String,ArrayList<String>>();
        
        List<List<String>> ans = new ArrayList<>();
        //List<List<String>> ans = new ArrayList<ArrayList<String>>();
            
        for(int i=0;i<strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tempString = Arrays.toString(temp);
            //Arrays.toString(temp);
            
            if(hmap.containsKey(tempString)){
                ArrayList<String> tempList = hmap.get(tempString);
                tempList.add(strs[i]);
                hmap.put(tempString,tempList);
            }
            else{
                ArrayList<String> tempList = new ArrayList<String>();
                tempList.add(strs[i]);
                hmap.put(tempString,tempList);
            }    
        }
        
        ans.addAll(hmap.values());
        return ans;
    }
}