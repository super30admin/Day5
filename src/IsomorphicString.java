
public class IsomorphicString {
	
    public boolean isIsomorphic(String s, String t) {

        
        if(s.length() != t.length())
            return false;
        
//         HashMap<Character,Character> sMap=new HashMap<>();
//         HashMap<Character,Character> tMap=new HashMap<>();
        
//         for(int i=0;i<s.length();i++){
            
//             char s1= s.charAt(i);
//             char t1=t.charAt(i);
            
//             if(sMap.containsKey(s1)){
//                 if(sMap.get(s1)!=t1)
//                     return false;
//             }else{
                
//                 sMap.put(s1,t1);
//             }
//               if(tMap.containsKey(t1)){
//                 if(tMap.get(t1)!=s1)
//                     return false;
//             }else{
                
//                 tMap.put(t1,s1);
//             }
            
//         }
        
        
        char [] sMap= new char[100];
        char [] tMap= new char[100];
        
        
        for(int i=0;i< s.length();i++){
            
            char sChar= s.charAt(i);
            char tChar=t.charAt(i);
            
            if(sMap[sChar - ' ']!=0){
                if(sMap[sChar - ' '] != tChar)
                    return false;
            }else{
                sMap[sChar - ' '] =tChar;
            }
            
            
            if(tMap[tChar - ' ']!=0){
                if(tMap[tChar - ' '] != sChar)
                    return false;
            }else{
               tMap[tChar - ' '] =sChar;
            }
            
            
        }
        
        return true;
        
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "egg", t = "add" ;
		IsomorphicString objIn = new IsomorphicString();
		
		System.out.println(objIn.isIsomorphic(s, t));

	}

}
