"""
Problem Statement:
    You are given a DNA sequence: a string consisting of characters A, C, G,
    and T. Your task is to find the longest repetition in the sequence. This is a
    maximum-length substring containing only one type of character. Input The
    only input line contains a string of n characters. Output Print one integer: the
    length of the longest repetition. Constraints
    1 ≤ n ≤ 106
    Example Input: ATTCGGGA
    Output: 3
"""

s = input()
ch = '0'
ans = 1
count = 0
for char in s :
    if ch == char:
        # if char is same, incrementing count
        count += 1
    else :
        #Else getting max till and reseting the flags
        ans = max(ans, count)
        count = 1
        ch = char
ans = max(ans, count)
print(ans)