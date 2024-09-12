//Sorting solution implemented in O(nklogk) time complexity and constant space complexity

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string> >m;
        //First sort the strings in strs
        for(string s:strs)
        {
            string t=s;
            sort(t.begin(),t.end());
            m[t].push_back(s);
        }
		//Declare an vector of string vector type for storing the output
        vector<vector<string>>a;
		//Push all out anagrams from m to a for returing
        for(auto x:m)
            a.push_back(x.second);
        return a;
    }
};

--------------------------------------------------------------------------------------------------------------------------------------------------------
//Solved using the prime product method in O(nk) time complexity and constant space complexity

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        //Initializing a map
        unordered_map<long double,vector<string>>m;
        //Initializing the final result
        vector<vector<string>>A;
        //Iterating through the vector of string strs to get the individual strings
        for(auto s:strs)
        {
            //Sorting the strings
            long double p=primeproduct(s);
            /*string t=s;
            sort(t.begin(),t.end());*/
            m[p].push_back(s);                
        }
        for(auto x:m)
            A.push_back(x.second);
        return A;    
    }
    long double primeproduct(string str)
    {
        int prime[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        long double result=1;
        for(int i=0;i<str.size();i++)
            result=result*prime[str[i]-'a'];
        return result;
    }
};