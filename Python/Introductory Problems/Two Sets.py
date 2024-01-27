"""
Problem Statement:
    Your task is to divide the numbers 1,2,. . . ,n into two sets of equal sum.
    Input:
        The only input line contains an integer n. 
    Output:
        Print ”YES”, if the division is possible, and ”NO” otherwise. 
        After this, if the division is possible, print an example of how to create the sets. 
        First, print the number of elements
        in the first set followed by the elements themselves in a separate line, and then,
        print the second set in a similar way. 
    Constraints:
        1 <= n <= 10^6
    Example 1:
        Input: 
            7
        Output: 
            YES 
            4 
            1 2 4 7 
            3 3 5 6 
    Example 2 :
        Input: 
            6
        Output: 
            NO
"""

"""
Solution:
    Logic here is to give both the extremes to sets alternatively i.e., 1 & n goes to set 1 and 2 & (n-1) goes to set 2 ...
    So, the numbers need to get divided by 4 as 4 numbers are poped up for each round.
    If % 4 = 0, means we can distribute numbers as per above logic
    If % 4 = 1, means 1 number is remaining at end, which cant be given to any set, so no possibility
    If % 4 = 2, means 2 numbers are remaining, even if each is distributed among to 2 sets, we cant achieve equal sum
    If % 4 = 3, means 3 number are remaining. We can distribute this if one number = sum of other 2. Or simply give 1,2 to one set 
        and 3 to other. Now you left with count of numbers divisible by 4. And start spliting. Only difference is this time the numbers are 4,5...n
"""

n = int(input())
if n%4 == 1 or n%4 == 2 :
    print("NO")
else :
    print("YES")
    
    if n%4 == 3 : 
        print((n+1) // 2 )
        print(1,2, end = " ")
        start = 4
    else:
        start = 1
        print(n//2)
    i = start
    j = n
    while i < j:
        print(i,j, end = " ")
        i +=2
        j -= 2
    print()
    print(n//2)
    if start == 4 :
        print(3, end = " ")
    i = start + 1
    j = n -1
    while i < j:
        print(i,j, end = " ")
        i +=2
        j -= 2