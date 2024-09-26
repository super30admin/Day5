// TC : O(n)
// SC : O(1)
//worked in leetcode
//create hashmap containing hash as key and value as all string
//check if hash of string exist if yes update current entry or create new entry
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String>> map = new HashMap<>();

        for(int i=0; i < strs.length; i++){
            long hash = getHash(strs[i]);
            List<String> innerList  = map.getOrDefault((hash), new ArrayList<>());

            innerList.add(strs[i]);
            map.put(hash, innerList);
        }

        List<List<String>> output = new ArrayList<>();

        for(List<String> anagram : map.values()){
            System.out.print("anagram...");
            output.add(anagram);
            System.out.print(anagram);
        }

        return output;
    }

    private static long getHash(String str){
        long hash = 1;
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

        for(int i=0; i< str.length(); i++){
            int ch = str.charAt(i);
            System.out.println(" ch is:"+ ch);
            hash = hash * primes[ch-'a'];
        }

        return hash;
    }

    public static void main(String [] args){
        String []  strs = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }
}