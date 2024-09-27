

// Time Complexity : O(n * k Log k) where k is average length
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

    func groupAnagrams(_ strs: [String]) -> [[String]] {
        var dict = [String:[String]]()
        for str in strs {
            var sortedStr = String(str.sorted())
            if let stringArray = dict[sortedStr] {
                var strArray = stringArray
                strArray.append(str)
                dict[sortedStr] = strArray
            } else {
                var stringArray = [String]()
                stringArray.append(str)
                dict[sortedStr] = stringArray
            }
        }
        return Array(dict.values)
    }


