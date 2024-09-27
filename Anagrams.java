public class Anagrams {

        // TC is nklogk
        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> anagramMap = new HashMap<>();
            List<List<String>> result = new ArrayList<>();
            for(String str: strs){  // loop over n muber of strings
                char[] orderedChar = str.toCharArray();
                Arrays.sort(orderedChar);
                String orderedString = String.valueOf(orderedChar);  // sorting is klogk where k is the length of the string
                if(anagramMap.get(orderedString) == null){
                    anagramMap.put(orderedString, new ArrayList<>());
                }
                anagramMap.get(orderedString).add(str);
            }
            return new ArrayList<>(anagramMap.values());
        }

        public static void main(String args[]){
            String[] words = {"eat","tea","tan","ate","nat","bat"};
            groupAnagrams(words);
        }
}
