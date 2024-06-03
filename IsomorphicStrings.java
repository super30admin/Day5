class Solution {
    func isIsomorphic(_ s: String, _ t: String) -> Bool {
        transFormString(s) == transFormString(t)
    }

    func transFormString(_ s: String) -> String {
        var dict: [String: Int] = [:]
        
        var str = ""
        for i in 0..<s.count {
            var sStr = String(s[s.index(s.startIndex, offsetBy: i)])
            if !dict.keys.contains(sStr) {
                dict[sStr] = i
            }

            str.append("\(dict[sStr]) ")
        }
        return str
    }
}
