// HashMap: 
// Key - sorted value of string (same for anagrams)
// Value - List of strings which matches the key when sorted.
// return each value of the hashmap
// Complexity - O(n + k logk) - k is size if each string
import java.util.*;
class Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<String, List<String>>();

        //O(n) 
        for(int i=0;i<strs.length;i++){
            char temp[] = strs[i].toCharArray();
            Arrays.sort(temp); //O(klogk)
            String key = new String(temp); 
            if(hmap.containsKey(key)){
                List<String> value = hmap.get(key);
                value.add(strs[i]);
                hmap.put(key, value);
            }
            else{
                List<String> value = new ArrayList<String>();
                value.add(strs[i]);
                hmap.put(key, value);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();

        // O(n)
        for(Map.Entry<String, List<String>> anagramSet : hmap.entrySet()){
            
            result.add(anagramSet.getValue());
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args){
        System.out.println("Anagrams Implementation");
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Anagrams obj =  new Anagrams();
        obj.groupAnagrams(words);
    }
}