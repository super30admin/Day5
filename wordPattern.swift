

// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

    func wordPattern(_ pattern: String, _ s: String) -> Bool {
            var sdict = [String:Character]()
            var patternDict = [Character:String]()
        let sArray = s.split(separator: " ")
            var patternArray = Array(pattern)
            if sArray.count != patternArray.count {
                return false
            }
            for i in 0..<sArray.count {
                if let str = sdict[String(sArray[i])], str != patternArray[i]  {
                    return false
                }
                else if let char = patternDict[patternArray[i]],char != sArray[i] {
                    return false
                }
                else {
                    sdict[String(sArray[i])] = patternArray[i]
                    patternDict[patternArray[i]] = String(sArray[i])
                }
            }
            return true
        }


