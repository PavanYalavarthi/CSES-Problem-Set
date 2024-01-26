/*
Problem Statement:
    You are given all numbers between 1,2,. . . ,n except one. Your task is to
    find the missing number. Input The first input line contains an integer n. The
    second line contains n-1 numbers. Each number is distinct and between 1 and
    n (inclusive). Output Print the missing number. Constraints
    2 ≤ n ≤ 2 · 10^5
    Example Input: 5 2 3 1 5
    Output: 4
*/

//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#define ll long long int

#include<iostream>
using namespace std;
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    uint n;
    cin >> n;
    uint ans = n, element;
    for(uint i = 1; i< n; i++) {
        cin >> element;
        ans ^= (i ^ element);
    }
    cout << ans;
    return 0;
}