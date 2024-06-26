/*
 * Time complexity: O(n log l)
 * Space complexity: O(n)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        HashMap<Double, List<String>> map= new HashMap<>(); 
        for(int i=0 ; i<strs.length ; i++) {
            double primeMult = 1;
            for(int j=0 ;j<strs[i].length() ; j++) {
                int index = (int) strs[i].charAt(j) - (int) 'a'; 
                primeMult = primeMult * prime[index];
                System.out.println(primeMult);   
            }
            if(map.containsKey(primeMult)) {
                List<String> list = map.get(primeMult);
                list.add(strs[i]);
                map.put(primeMult, list);
            } else {
                List<String> list= new ArrayList<>();
                list.add(strs[i]);
                map.put(primeMult, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}