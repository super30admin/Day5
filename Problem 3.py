class Solution():
    def wordPattern(self,pattern, s):
        wL=s.split()

        p2wL , wL2p = {},{}

        if len(wL) != len(pattern):
            return False

        for i in range(len(pattern)):
            if pattern[i] in p2wL and p2wL[pattern[i]] != wL[i]:
                return False

            if wL[i] in wL2p and wL2p[wL[i]] != pattern[i]:
                return False

            p2wL[pattern[i]]=wL[i]
            wL2p[wL[i]]=pattern[i]

        return True