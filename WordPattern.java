//290. Word Pattern
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr=s.split(" ");
        int n=pattern.length();
        if(n !=arr.length)
            return false;
        
        HashMap<Character,String> c2s=new HashMap<>();
        HashMap<String, Character> s2c=new HashMap<>();
        char ch;
        for(int i=0;i<n;i++)
        {
            ch=pattern.charAt(i);
            if( c2s.containsKey(ch)^ s2c.containsKey(arr[i]))
                return false;
            else
            {
                if((c2s.containsKey(ch) && !arr[i].equals(c2s.get(ch))) ||(s2c.containsKey(arr[i]) && s2c.get(arr[i])!=ch))
                    return false;
                else
                {
                    c2s.put(ch,arr[i]);
                    s2c.put(arr[i],ch);
                }
            }
        }
        return true;
    }
}