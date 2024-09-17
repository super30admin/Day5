// Time Complexity : O(n)
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        int len = strs.size();
        int i = 0; int j;
        unsigned long sum;

        //Map the hash function key to index of output vector
        unordered_map<unsigned long, int> sum_map;
        //Iterator
        unordered_map<unsigned long, int>::iterator itr;
        
        //Output return vector
        vector<vector<string>> ret_vect;
        
        //Prime Array which is mapped to alphabets
        int prime_arr[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101, 103};
        
        string temp;
        
        for(i = 0; i < len; i++)
        {
            //Get the string
            temp = strs[i];
            
            j = 0;
            sum = 1;
            
            //Compute the Hash Function value
            //Prime numbers corresponding to letter multiplied together
            while(temp[j] != '\0')
            {
                sum *= prime_arr[int(temp[j])-96];
                j++;
            }
            
            itr = sum_map.find(sum);
            //New String condition
            if(itr == sum_map.end())
            {
                //Insert in Map   
                vector<string> str_vect;
                str_vect.push_back(temp);
                
                ret_vect.push_back(str_vect);
                cout << ret_vect.size() << endl;
                sum_map.insert(pair<unsigned long, int>(sum, ret_vect.size()-1));
            }
            //Existing Anagram condition
            else
            {
                //Add in the particular vector index
                ret_vect[itr->second].push_back(temp);
            }
        }
        return ret_vect;
    }
};