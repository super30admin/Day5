class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)
        {
            return new ArrayList<>();
        }
        
        //assigning all the char with a prime number
        int[] pn = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        HashMap<Long,ArrayList<String>> a =  new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            char[] a1 = strs[i].toCharArray();
            long number = 1L;

            //calculate the prime product
            for(int j=0;j<a1.length;j++)
            {
                number = number* pn[a1[j]-'a'];
            }
            
            if(a.containsKey(number)==false)
            {
                ArrayList<String> o = new ArrayList<>();
                o.add(strs[i]);
                a.put(number,o);
            }
            else{
                a.get(number).add(strs[i]);
            }
        }
        return new ArrayList<>(a.values());
        
    }
}
//runtime would be O(nk) where n is the total number of words and k is the length of each word. for the rest of the prob it is O(1)
//except .contains() which is again O(n) because it check the whole hashmap in worst case

//space complexity : it is O(nk) because we are storing N words with each word being k length.
