public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
     IList<IList<string>> result = new List<IList<string>>();   
    Dictionary<string, List<string>> map = new Dictionary<string, List<string>>();
    foreach(string anagram in strs){
        char[] tempArray = anagram.ToCharArray();
        Array.Sort(tempArray);
        string sorted = new string(tempArray);
        if(!map.ContainsKey(sorted)){
            map.Add(sorted, new List<string>(){ anagram });                
        }else{
            map[sorted].Add(anagram);   
        }
    }
    foreach(var pair in map){
        result.Add(pair.Value);
    }
    return result;
        
    }
}
