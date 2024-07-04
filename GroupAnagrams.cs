//TC:O(N)
//SC:O(N)
public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        Dictionary<string,List<string>> map = new Dictionary<string,List<string>>();
        
        foreach(var str in strs){
            char[] charArray = str.ToCharArray();
            Array.Sort(charArray);
            string sortedStr = new string(charArray);
            
            if(!map.ContainsKey(sortedStr)){
                map.Add(sortedStr,new List<string>());
            }
            
            map[sortedStr].Add(str);
        }
        
        IList<IList<string>> result = map.Values.Select(list => (IList<string>)list).ToList();
        return result;
    }
}