//LeetCode -> Passed
//Time Complexity - O(n)
/* Runtime: 13 ms, faster than 33.88% of Java online submissions for Group Anagrams.
Memory Usage: 44 MB, less than 47.95% of Java online submissions for Group Anagrams.*/

class HashingAnagrams_13 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> ret = new ArrayList<List<String>>();
        for( String k : strs){            
            char[] tempString = k.toCharArray();
            Arrays.sort(tempString);
            String m = Arrays.toString(tempString);
            if(!map.containsKey(m)){
                //Creating a new list for new key
                List<String> st = new ArrayList<String>();
                st.add(k);
                map.put(m,st);
                
            }
            else{  
                //Adding to the exisiting list
                map.get(m).add(k);
            }
            
        }
        for(String m : map.keySet()){
            //Iterate through all keys of hashmap and append the values to the final list
            if(map.containsKey(m)) ret.add(map.get(m));
        }
        return ret;
        }
    }