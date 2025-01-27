class Solution:
    def isPalindrome(self, x: int) -> bool:
        temp=str(x)
        x=(str(x))[::-1]
        if x==temp:return True
        else:return False
