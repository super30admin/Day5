class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       String[] t= strs.clone();
        int j=0;
       for(String s:t){
           char temp[] = s.toCharArray();
           Arrays.sort(temp);
            t[j] = new String(temp);
           j++;
       }
        HashMap<String,List<String>> map = new HashMap<>();
  
        for(int i=0;i<strs.length;i++){
            ArrayList<String> l = new ArrayList<>();
            if(!map.containsKey(t[i])){    
            map.put(t[i],l);
            map.get(t[i]).add(strs[i]);
            }
            else{
                map.get(t[i]).add(strs[i]);
            }
        }
        
        return new ArrayList<>(map.values());
    }
        
    }
