//T: O(NK), N is strs length, K is avg number of letters for each word in strs
//S: O(NK)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, LinkedList<String>> map = new HashMap<>();

        for(String s: strs){
            String sortS = sort(s);
            if(!map.containsKey(sortS))
                map.put(sortS, new LinkedList<String>());
            map.get(sortS).add(s);
        }

        return new LinkedList<List<String>>(map.values());
    }

    public String sort(String s){

        String result = "";

        int[] letters = new int[26];

        for(char ch : s.toCharArray()){
            letters[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            String alphabet = Character.toString(i+'a');
            result += alphabet + String.valueOf(letters[i])+"#";
        }

        return result;
    }

}