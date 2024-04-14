Time Complexity:O(n): n is the length of the pattern.
Space Complexity:O(1): For each alphabet there should be only one mapping, hence space is constant
Challenges: Intitally contains search values is done, Contians search on all values takes o(n) time complexity. 
	    To optimize the solution go with a set, and contains search on set is O(1)  time complexity.
Approach: Approach to solve this problem is to traverse through the input string and check if the map contains the mapping 
for the alphabet. If it contains then check if it matches to the value in s. If map doesnt contain key then check if set 
has the value stored already. If set has the value already then a set has multiple keys and words are not in pattern.
Insert the values into map if it doesnt contain input key value mapping.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
		HashSet<String> set=new HashSet<String>();        
        if(pattern.length() != s.split(" ").length) return false;
		for(int i=0;i<pattern.length();i++) {
			char c=pattern.charAt(i);
			String str=s.split(" ")[i];
			if(map.containsKey(c)) {
				if(!map.get(c).equals(str)) return false;									
			}
			else {
				if(set.contains(str)) return false;
				set.add(str);
				map.put(c,str);
			}
		}
		return true;        
    }
}