class Solution {
    public boolean wordPattern(String s, String str) {
    String[] t = str.split(" ");
      if(s.length()!=t.length) return false;
        HashMap<Character,String> h = new HashMap<>();
        HashMap<String,Character> h1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h.get(s.charAt(i))!=null){
                if(!h.get(s.charAt(i)).equals(t[i])) return false;
            }
            else h.put(s.charAt(i),t[i]);
              if(h1.get(t[i])!=null){
                if(!h1.get(t[i]).equals(s.charAt(i))) return false;
            }
            else h1.put(t[i],s.charAt(i));


        }
        return true;
        }
    };

    // word pattern question in java
