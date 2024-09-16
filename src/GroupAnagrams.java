import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0)
            return new ArrayList<>();
        
        HashMap<Long, List<String>> aMap= new HashMap<>();
        
        for(String input : strs){
            
            long primeNumber= getPrimeNumber(input);
            
            if(!aMap.containsKey(primeNumber)){
                aMap.put(primeNumber,new ArrayList<>());
            }
            
            aMap.get(primeNumber).add(input);
            
            
            
        }
        return new ArrayList<>(aMap.values());
        
    }
    
    private Long getPrimeNumber(String input){
        
        long result=1;
        
        int[] prime={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        for(int i=0;i<input.length();i++){
            char c= input.charAt(i);
            result= result* prime[c - 'a'];
        }
        
        return result;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		GroupAnagrams objIn= new GroupAnagrams();
		
		System.out.println(objIn.groupAnagrams(strs));

	}

}
