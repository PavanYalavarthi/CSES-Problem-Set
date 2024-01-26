"""
Problem Statement:
    You are given an array of n integers. You want to modify the array so that
    it is increasing, i.e., every element is at least as large as the previous element.
    On each move, you may increase the value of any element by one. What is
    the minimum number of moves required?\

    Input
    The first input line contains an integer n: the size of the array.
    Then, the second line contains n integers x1, x2, . . . , xn : thecontentsof thearray.

    Output
    Print the minimum number of moves.

    Constraints
    1 ≤ n ≤ 2 · 10^5
    1 ≤ xi ≤ 10^9

    Example
    Input:
    5
    3 2 5 1 7
    Output:
    5
"""

n = int(input())
element_list = list(map(int, input().split()))
maxi = 0
ans = 0
for element in element_list:
    if element >= maxi :
        maxi = element
    else :
        ans += maxi - element
print(ans)