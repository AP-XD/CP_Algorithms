class Solution:
    def reverseWords(self, s: str) -> str:
        arr = s.split()
        ans = ""
        for i in arr:
            ans += i[::-1] + " "
        return ans[:-1]