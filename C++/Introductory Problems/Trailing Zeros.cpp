/*
Problom Statement:
    Your task is to calculate the number of trailing zeros in the factorial n!. For
    example, 20!=2432902008176640000 and it has 4 trailing zeros. 
    Input 
        The only input line has an integer n. 
    Output 
        Print the number of trailing zeros in n!.
    Constraints
        1 <= n <= 109
    Example 
        Input: 20
        Output: 4
*/

/*
Solution:
    Since 10 = 2 * 5 and 5 is the largest prime, ans is number of times 5 can divide n!
*/

//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#define ll long long int

#include<iostream>

using namespace std;
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    ll n, ans = 0;
    cin >> n;
    while(n) {
        ans += n/5;
        n /= 5;
    }
    cout << ans;
   return 0;
}