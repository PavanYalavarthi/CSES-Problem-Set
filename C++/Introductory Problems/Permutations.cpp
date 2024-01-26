/*
Problem Statement:
    A permutation of integers 1,2,. . . ,n is called beautiful if there are no adjacent
    elements whose difference is 1. Given n, construct a beautiful permutation if
    such a permutation exists. Input The only input line contains an integer n.
    Output Print a beautiful permutation of integers 1,2,. . . ,n. If there are several
    solutions, you may print any of them. If there are no solutions, print ”NO
    SOLUTION”. Constraints
    1 ≤ n ≤ 106
    Example 1 
        Input: 5
        Output: 4 2 5 3 1 
    Example 2 
        Input: 3
        Output: NO SOLUTION
*/
//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#define ll long long int

#include<iostream>
#include<algorithm>

using namespace std;
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    long n;
    cin >> n;
    /*
        For n = 1, we can achieve as there is only single element
        For n=2 & 3, we can't achieve 
        For n >= 4, we can achieve this by setting permutation with adjacent elements to hold difference 2
    */
    if( n == 1) cout << 1;
    else if( n < 4) cout << "NO SOLUTION";
    else {
        for( long i = 2; i <= n; i+=2) cout << i << " ";
        for( long i = 1; i <= n; i+=2) cout << i << " ";
    }
    return 0;
}