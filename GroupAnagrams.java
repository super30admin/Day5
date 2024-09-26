// Time Complexity : O(Nk)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Here we are using an array to store the first 26 prime numbers. For each string in the input , we calculate the value of it using the prime number
//array. That is always going be unique as multiplcation of prime numbers is always unique. We store that value as a key in a hashmap of Integer and
//List of strings. For each key, we keep on adding the string to the list of strings for the value(key) it is equal to.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Long,List<String>> map = new HashMap<>();
        for(String s : strs)
        {
        	//calling the method to calculate the value of the word
            long wordValue = wordVal(s); 
            //if the map doesnt contain the value
            if(!map.containsKey(wordValue))
            {
            	//add the value as key and an arraylist
                map.put(wordValue,new ArrayList<>());
            }
            //add the word in the list corresponding to the key
            map.get(wordValue).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
    //method to calculate the value of the string
    private long wordVal(String s)
    {
    	//array to store 26 prime numbers to map to each character a,b,c,d....
       int[] primeNos = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
       long val = 1;
       
       //calculate the value of the word
        for(int i=0;i<s.length();i++)
        {
        	//getting the value from the array comparing the ascii value of each character with a as a -a would go to the 0th element ,b to the 2nd,...
            val = val * primeNos[s.charAt(i) - 'a'];
        }
        return val;
    }
}