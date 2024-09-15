class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap m = new HashMap();
        String[] ss = s.split(" ");
        if (ss.length!=pattern.length()){
            return false;
        }
        for ( Integer i = 0; i<ss.length; i++){
            char p = pattern.charAt(i);
            String sss = ss[i];
            if(!m.containsKey(p)){
                m.put(p,i);
            }
            if(!m.containsKey(sss)){
                m.put(sss,i);
            }
            if(m.get(p) != m.get(sss)){
                return false;
            }
        }
        return true;
}
}
//tc = O(n)
//sc = O(n)
