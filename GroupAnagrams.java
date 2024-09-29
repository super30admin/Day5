// This solution uses an approach to assign prime numbers to each of the alphabet that are between the a-z. In this way we will ensure that the product of each unique set of all anagrams will produce same value. In this way we can return all the list of grouped anagrams in the given array of strings. 

// Time complexity: O(n)
// Space complexity: O(n)

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primeNumbers = generatePrimeNumbers(26);
        List<List<String>> result = new ArrayList<>();
        //check the null condition
        if(strs == null || strs.length ==0) return result;
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String str: strs){
            double hash = getHash(str, primeNumbers);
            if(!map.containsKey(hash)){
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    private int[] generatePrimeNumbers(int length){
        int[] a = new int[length];
        a[0] = 2;
        int count =1;
        int check = 3;
        while(count<length){
            boolean flag = true;
            for(int i=2;i*i<=check;i++){
                if (check%i == 0) flag = false;
            }
            if(flag){
                a[count] = check;
                count++;
            } 
            check++;
        }
        
        return a;
    }
    private double getHash(String s, int[] primeNumbers){
        double hash = 1d;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hash *= primeNumbers[c-'a'];
        }
        return hash;
    }
    
}