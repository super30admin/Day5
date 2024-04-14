Time complexity: O(n)
Space complexity:O(1)
Challenges:Calculated HashValue should be double because for a long length of string values integer range wont be sufficient.
Approach:Initial approach to solve this problem is get the CharArray from the string and sort it. Insert sorted value as key and value as the list of strings. 
Sorting algorithm takes O(nlogn) time compexity. To optimize it go with the primae factor technique. 
In prime factor technique, assign a prime number for all alphabets. The multiplication value of prime numbers is always unique. 
Ex: ab and ba gives same product.

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {    
        if(strs==null || strs.length==0)  return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(String str:strs){
            double hashValue=getHash(str);                        
            if(!map.containsKey(hashValue)){              
                map.put(hashValue, new ArrayList<>());
            }
            map.get(hashValue).add(str);            
        }

        // List<List<String>> arrayList=new ArrayList<>();
        // for(Map.Entry<Double, List<String>> mapEntry: map.entrySet()){
        //     arrayList.add(mapEntry.getValue());
        // }

        return new ArrayList<>(map.values());
    }

    public double getHash(String str){
        double total=1;
        int[] primeNumbers={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        for(char c:str.toCharArray()){
            total*=primeNumbers[c-'a'];
        }
        return total;
    }
/*
System.out.println("Sonam");
        int number=100;
        List<String> arrayList=new ArrayList<>();
        for(int i=2;i<number;i++){
           // System.out.println("test");
           int value=i;
           int count=0;
           for(int j=2;j<value;j++){
            if(i%j==0){
                count++;
            }           
           }
            if(count==0) arrayList.add(value+"");
        }
        List<List<String>> out=new ArrayList<>();
        out.add(arrayList);
        return out;*/
}