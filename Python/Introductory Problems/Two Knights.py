"""
Problem Statement:
    Your task is to count for k=1,2,. . . ,n the number of ways two knights can be
    placed on a k ×k chess board so that they do not attack each other.
    Input:
        The only input line contains an integer n.
    Output :
        Print n integers: the results.
    Constraints :
        1 <= n <= 10000
    Example:
        Input: 8
    Output: 
        0 
        6 
        28 
        96 
        252 
        550 
        1056 
        1848
"""

"""
Solution:
    considering board is i x i
    Total possibilities :
        First knight can go in any of the i^2 squares and second can be in i^2 -1; 
        So, total possiblities  = i^2 * ( i^2 -1) / 2 [combinations]
    Possibilities of attacking:
       Total number of 3 x 2 squares in chess board : (i-1) * (i-2) [Horizontally] + (i-1) * (i-2) [Vertically] = 2 * (i-1) * i-2)
        Attacking positions are 2 [Placing at the corners]
        So, number of attacking positions = 2 * 2 * (i-1) * (i-2)
    Number of non attacking  = total - attacking positions
"""

n = int(input())
for i in range(1,n+1):
    s = i * i
    print(s * (s-1) // 2 - 4 * (i-1) * (i-2))