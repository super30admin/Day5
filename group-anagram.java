// Time Complexity :O(n) 
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no
class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        
        String[] news=new String[s.length];
        
        List<List<String>> ls=new ArrayList<List<String>>();
        HashSet<String> hs=new HashSet<String>();
        for(int i=0;i<s.length;i++){
            char[] temp=s[i].toCharArray();
            Arrays.sort(temp);
            news[i]=new String(temp);
            if(!hs.contains(news[i]))
                hs.add(news[i]);
           
            
        }
        Iterator<String> it=hs.iterator();
        while(it.hasNext()){
            String val=it.next();
            ArrayList<String> templ=new ArrayList<String>();
            for(int i=0;i<news.length;i++)
                if(news[i].compareTo(val)==0)
                    templ.add(s[i]);
            ls.add(templ);
        }
        // System.out.println(ls);
        
        return ls;
        
        
    }
}