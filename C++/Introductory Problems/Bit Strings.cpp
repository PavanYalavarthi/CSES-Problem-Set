/*
Problem Statement:
    Your task is to calculate the number of bit strings of length n. For example,
    if n=3, the correct answer is 8, because the possible bit strings are 
    000, 001,010, 011, 100, 101, 110, and 111. 
    Input:
        The only input line has an integer n.
    Output:
        Print the result modulo 10^9 + 7.
    Constraints
        1 ≤ n ≤ 10^6
    Example 
        Input: 3
        Output: 8

*/

/*
Solution:
   Its (2^n) % MOD
*/

//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#define ll long long int
int MOD = 1000000007;

#include<iostream>

using namespace std;
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    ll n, ans = 1, a = 2;
    cin >> n;
    //Binary exponentiation
    while (n > 0) {
        if (n & 1) (ans *= a) %= MOD;
        (a *= a) %= MOD;
        n >>= 1;
    }
    cout << ans;
   return 0;
}