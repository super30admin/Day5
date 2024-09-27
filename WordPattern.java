//timecomplexity:O(n)
//space complexity:O(m) where m are unique words
import java.util.HashMap;

public class WordPattern {
   
        public boolean wordPattern(String pattern, String s) {
            String arr[]=s.split(" ");
            if(pattern.length()!=arr.length){
                return false;
            }
            HashMap<Character,String> hm=new HashMap<Character,String>();
            for(int i=0;i<pattern.length();i++){
                if(hm.containsKey(pattern.charAt(i))){
                    String st=hm.get(pattern.charAt(i));
                    if(!st.equals(arr[i])){
                        return false;
                    }
                }else if(hm.containsValue(arr[i])){
                    return false;
                }else{
                    hm.put(pattern.charAt(i),arr[i]);
                }
            }
            return true;
            
        }
    
    
}
