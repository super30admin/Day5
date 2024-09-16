class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    int count = 0;
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    List<List<String>> result = new ArrayList<List<String>>();
    for( int i = 0; i < strs.length; ++i){

        char[] s = strs[i].toCharArray();
        Arrays.sort(s);
        String tempS = new String(s);
    
        if(map.containsKey(tempS) == true){
            //anagram exists
            List<String> temp =  result.get(map.get(tempS));
            temp.add(strs[i]);
           // System.out.println(temp.size());            
        }else{
            //anagram doest not exists
    
            result.add(new ArrayList<String>());            
            map.put(tempS,count++);
            List<String> temp =  result.get(map.get(tempS));
            temp.add(strs[i]);
            
            
        }
        
    }
        return result;
    }
}

/*
Time Complexity: 
o( nlogm )
m- maxinmum size of a word
n- number of words
Space Complexity:
o(N)
N = unique number of words in the given array
*/
