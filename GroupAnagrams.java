/*
*Time complexity: O(nmlogm)
*Space Complexity: O(n)
*Accepted on leetcode
* I'm sorting each input string and adding it to a hashmap so that each of its anangram gets added to the same key
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        char[] charsArray = null;
        String charString = "";
        for(String str : strs){
            charsArray = str.toCharArray();
            Arrays.sort(charsArray);
            System.out.println(charsArray);
            charString = new String(charsArray);
            System.out.println(charString);
            if(anagramMap.containsKey(charString)){
                //System.out.println(Arrays.toString((anagramMap.get(charString)).toArray()));
                
                anagramMap.get(charString).add(str);
                //System.out.println(Arrays.toString((anagramMap.get(charString)).toArray()));
            }
            else{
                List<String> s = new ArrayList<>();
                s.add(str);
                anagramMap.put(charString,s);
            }
        }
        
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : anagramMap.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}