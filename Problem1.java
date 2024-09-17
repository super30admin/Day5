

//Time- O(n*klogk)
//Space- O(n*k)
//n-> no of elements in given list
//k->size of each word

//Passed in leetcode- yes

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
       
        Map<String ,List> hm =new HashMap<String ,List>();
        
        for(int i=0;i<strs.length;i++)                  //go through string
        {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);                         //sort the string
            if(!hm.containsKey(String.valueOf(chars)))  
            {
                hm.put(String.valueOf(chars) , new ArrayList());//add it to the hashmap, if not present already
                System.out.println(String.valueOf(chars));
                
            }
                hm.get(String.valueOf(chars)).add(strs[i]);       //if already present add tot he list, in values     
            
        }
        
        return new ArrayList(hm.values());//return list of values
    }
}
