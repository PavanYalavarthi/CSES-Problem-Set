"""
Problem Statement:
    Given a string, your task is to generate all different strings that can be created using its characters.
    Input
        The only input line has a string of length n. Each character is between a–z.
    Output
        First print an integer k: the number of strings. Then print k lines: the strings in alphabetical order.
    Constraints

    1 < = n <=  8

    Example
    Input:
    aabac

    Output:
    20
    aaabc
    aaacb
    aabac
    aabca
    aacab
    aacba
    abaac
    abaca
    abcaa
    acaab
    acaba
    acbaa
    baaac
    baaca
    bacaa
    bcaaa
    caaab
    caaba
    cabaa
    cbaaa
"""

"""
Solution:
    sort the string to get least alphabetic string and use permutations from itertools to get list of  permutation
"""

from itertools import permutations
s = set()
for i in permutations(sorted(input())):
    s.add("".join(i))
print(len(s))
for i in sorted(s):
    print(i)