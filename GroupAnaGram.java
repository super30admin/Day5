// Time Complexity :
  //sorting each word: O(xlog x)  x = average length of each word.
  //adding each word to map list: O(1)
  //adding all values from map to return list: O(m)  m = unique anagrams.
  //total: O(nxlog x) + O(m)   n = number of words.
// Space Complexity :
  // hashMap : O(n) n = number of words.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
  //not really.
// Your code here along with comments explaining your approach
  //sort each word
  //create a map on sorted word and all other words matching sorted word.
  //eg: aet: {eat, tea,..}
  //add all the values from map to return list.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        List<List<String>> ret = new ArrayList<>();

        //iterate over all words.
        for(String word: strs){
            //sort each word. get sorted word.
            char charArr[] = word.toCharArray();
            Arrays.sort(charArr);
            String tempWrd = Arrays.toString(charArr);

            //see if tempWrd exists in map.
                //if does add word to list.
                //if not, create list , add word, add list to map.
            List<String> wrdList = hmap.getOrDefault(tempWrd,null);
            if(wrdList == null){
                wrdList = new ArrayList<>();
                wrdList.add(word);
                hmap.put(tempWrd, wrdList);
            }
            else{
                wrdList.add(word);
            }
        }

        //add all lists from map to return list.
        ret.addAll(hmap.values());
        return ret;
    }
}
