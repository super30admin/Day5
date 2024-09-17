class Solution {
    public int primeProduct(String str){
        int[]  Alphabets = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        int result = 1;

        for (int i = 0;  i<str.length(); i++){
            char c = str.charAt(i);
            result = result * Alphabets[c - 'a'];
        }
        return result;
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Long, ArrayList<String>> anagrams = new HashMap<Long, ArrayList<String>>();

        List<List<String>> anagramslist = new ArrayList<List<String>>();

        for (String s : strs){
            long ind =  primeProduct(s);
            if (!anagrams.containsKey(ind)){
                anagrams.put(ind, new ArrayList<String>());}

            anagrams.get(ind).add(s);

        }
        for (Map.Entry<Long, ArrayList<String>> mapElement : anagrams.entrySet()) {

            anagramslist.add(mapElement.getValue());

        }
        return anagramslist;
    }
}