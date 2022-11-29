/*Approach: Using hashmap to group anagrams,sorting each string and using it as a key.
If two sorted strings are equal it means they are anagram. Group anagrams in a list.

Time Complexity:o(n* k log k):
        where n is number of strings in input
        k is the average length of the input strings
        sorting is k log k.

Space Complexity:o(n) as I will have to store all the strings in the hashmap for grouping them.
           where n is number of strings

 */
public class GroupAnagrams {
    /**
     * Given an array of strings, group all the anagrams together.
     * @param strs input strings
     * @return List of list of strings
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        //Edge case
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char arr[] = str.toCharArray();
            Arrays.sort( arr );
            String sortedStr = String.valueOf( arr );

            List<String> list;
            if(!map.containsKey( sortedStr )) {
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());

    }

    /**
     * Helper method to print  lists
     * @param inputStrings
     */
    private static void printList(List<List<String>> inputStrings){
        for(List<String> innerList:inputStrings){
            for(String str:innerList){
                System.out.print(str+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        printList(groupAnagrams(input));
    }
}