#Time Complexity O(N)
#Space Complexity O(N)
class Solution {
    
private String transformString(String s)
{
    HashMap<Character,Integer>mapping=new HashMap<>();
    StringBuilder builder=new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        char a=s.charAt(i);
        if(!mapping.containsKey(a))
        {
            mapping.put(a,i);
        }
       
        builder.append(Integer.toString(mapping.get(a)));
        builder.append(" ");
        
        
    }
    return builder.toString();
  
}
    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}