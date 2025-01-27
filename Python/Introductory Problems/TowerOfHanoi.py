"""
Problem Statement:
    The Tower of Hanoi game consists of three stacks (left, middle and right) and n round disks of different sizes. Initially, the left stack has all the disks, in increasing order of size from top to bottom.
    The goal is to move all the disks to the right stack using the middle stack. On each move you can move the uppermost disk from a stack to another stack. In addition, it is not allowed to place a larger disk on a smaller disk.
    Your task is to find a solution that minimizes the number of moves.
    Input
    The only input line has an integer n: the number of disks.
    Output
    First print an integer k: the minimum number of moves.
    After this, print k lines that describe the moves. Each line has two integers a and b: you move a disk from stack a to stack b.
    Constraints
    
    1 \le n \le 16
    
    Example
    Input:
    2
    
    Output:
    3
    1 2
    1 3
    2 3
"""

"""
Solution:
    Tower of hanoi takes 2^n -1 moves
    And first we transfer top n-1 disks from start to middle using end as middle tower
    Then shift the last disk fro start to end
    And shift the n-1 disks from middle to end using start as middle tower
"""

def TOH(start, middle, end, n):
    if n==0:
        return
    TOH(start, end, middle, n-1)
    print(start, end)
    TOH(middle, start, end, n-1)

n = int(input())
print(2 ** n - 1)
TOH(1, 2, 3, n)