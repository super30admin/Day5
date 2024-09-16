//Time - O(n * max(length(word in the input list)))
//Space - O(1)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> result = new HashMap<String, ArrayList<String>>();
        for(String word: strs)
        {
            String frequency = getFrequency(word);
            if(result.containsKey(frequency))
            {
                result.get(frequency).add(word);
            }
            else
            {
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(word);
                result.put(frequency, temp);
            }
        }
        return new ArrayList<List<String>>(result.values());
    }
    
    public String getFrequency(String word) {
        int[] frequency = new int[26];
        for(int i = 0; i < word.length(); i++)
        {
            frequency[word.charAt(i) - 'a'] += 1;
        }
        return Arrays.toString(frequency);
    }
}
