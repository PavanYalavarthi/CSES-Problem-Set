"""
Problem Statement:
    Given a string, your task is to reorder its letters in such a way that it becomes a palindrome (i.e., it reads the same forwards and backwards).
    
    Input
    The only input line has a string of length n consisting of characters A–Z.
    Output
    Print a palindrome consisting of the characters of the original string. You may print any valid solution. If there are no solutions, print "NO SOLUTION".
    Constraints
    
    1 <= n <= 10^6
    
    Example
    Input:
    AAAACACBA
    
    Output:
    AACABACAA
"""

"""
Solution:
   we needed to get count of every alphabet in the string. 
   
   As we needed palindrome, maximum permissable odd count chanracter is one, where can we place that in middle

   remaining we keep placing at the extremes
"""
s = input()
l = [0] * 26
for c in s:
    l[ord(c) - ord('A')] += 1
s = ""
o = ""
for i in range(26):
    if l[i] & 1 :
        if o != "":
            print("NO SOLUTION")
            break
        o = chr(i + ord('A'))
    s += chr(i + ord('A')) * (l[i] // 2)
else:
    print(s + o + s[::-1])
