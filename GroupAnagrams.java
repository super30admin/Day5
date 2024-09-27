// #1 Time Complexity :O(NK log K) where N is the length of str and K is the maximum length of a string in str.
// #2 Time Complexity :O(N K)
// Space Complexity :O(N K)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams1(String[] str){
        if (str.length == 0) return new ArrayList<>();
        // Map to store sorted word and its anagrams.
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: str){
            // for each word in the str array store its character in a character array for sorting
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            // store the sorted word in the string
            String sorted = String.valueOf(sArr);
            // if the map does not have the sorted word put the sorted word and an array.
            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            // Adding the current word in its sorted key.
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams2(String[] str){
        if (str.length == 0) return new ArrayList<>();

        HashMap<Double, List<String>> map = new HashMap<>();

        for(String s: str){
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }

    private static double primeProduct(String s){
        double result = 1;

        int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            result *= primes[c - 'a'];
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams2(arr));
    }
}
