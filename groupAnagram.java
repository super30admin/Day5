/* taking map to store key and values . Key as sorted string and value as arraylist of strings
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();       //created new map to store sorted string and arraylist of strings
        
        for(int i=0;i<= strs.length-1;i++){             
            char[] charArray = strs[i].toCharArray();       //coverting string-> character array for sorting 
            Arrays.sort(charArray);                         //sorting string
            String sortedString = new String(charArray);    //converting character array to string
            
            if(map.containsKey(sortedString)){              //checking if the sorted string of current string is present in the map
                map.get(sortedString).add(strs[i]);         //if yes adding string to arraylist
            }else{ 
                List<String> list = new ArrayList<>();      //if no creating new arraylist for new sorted list.
                list.add(strs[i]);
                map.put(sortedString,list);                 //adding to map
            }
        }
        List<List<String>> finalList = new ArrayList<>(map.values());   
        return finalList;                                   // returning all list of arraylist
    }
}