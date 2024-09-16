//Time Complecity: O(nklogK)
//Space Complecity: O(n);




class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list1 = new ArrayList<>();
        HashMap<String,List<String>> map1 = new HashMap<>();

        for(String s: strs){

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if(!map1.containsKey(sorted)){
                map1.put(sorted, new ArrayList<>());
            }

            map1.get(sorted).add(s);
        }

        list1.addAll(map1.values());
        return list1;

    }
}