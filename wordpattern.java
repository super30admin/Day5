Time complexity: O(1)
Space Complexity: O(n)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pat=pattern.toCharArray();
        String[] words=s.split(" ");
        HashMap<Character,String> a=new HashMap<Character,String>();
        HashMap<String,Character> b=new HashMap<String,Character>();
        if(pat.length!=words.length){
            return false;
        }
        for(int i=0;i<pat.length;i++){
            if(a.isEmpty()) {
            	a.put(pat[i], words[i]);
            	b.put(words[i],pat[i]);
            }
            else {
            	if(a.containsKey(pat[i])||b.containsKey(words[i])) {
            		if(!(a.containsKey(pat[i])&&b.containsKey(words[i])&&(a.get(pat[i]).equals(words[i])&&b.get(words[i]).equals(pat[i]))))
                       {
                           return false;
                       }            	}
            	else {
            		a.put(pat[i], words[i]);
                    b.put(words[i],pat[i]);
            	}
            }
        }
        return true;
    }
}