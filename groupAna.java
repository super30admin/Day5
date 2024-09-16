//Time complexity = O(n)
//Space Complexity = O(n)

class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();;

        HashMap <String, List<String>> map = new HashMap<>();

        for(int i=0; i< strs.length; i++){
            String sort = sortString(strs[i]);
            if(!map.containsKey(sort)){
                map.put(sort, new ArrayList<>());
            }

            map.get(sort).add(strs[i]);

        }

        return new ArrayList<>(map.values());

    }
    public String sortString(String str){
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

        
        
    }