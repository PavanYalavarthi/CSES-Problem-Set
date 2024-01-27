/*
Problem Statement:
    A number spiral is an infinite grid whose upper-left square has number 1.
    Here are the first five layers of the spiral:
                    1 2 9 10 25
                    4 3 8 11 24
                    5 6 7 12 23
                    16 15 14 13 22
                    17 18 19 20 21
    Your task is to find out the number in row y and column x.
    Input
        The first input line contains an integer t: the number of tests.
        After this, there are t lines, each containing integers y and x.
    Output
        For each test, print the number in row y and column x.
    Constraints
        1 ≤ t ≤ 10^5
        1 ≤ y, x ≤ 10^9
    Example 
        Input: 3 2 3 1 1 4 2
        Output: 8 1 15
*/


//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#define ll long long int

#include<iostream>

using namespace std;
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    ll t;
    cin >> t;
    while(t--){
        ll row,col;
        cin >> row >> col ;
        if(row > col ){
            if(row&1)cout << (row-1) * (row-1) + col  << endl;
            else cout << row * row - col  + 1  << endl;
        } else {
            if(col &1) cout << col  * col  - row + 1 << endl;
            else cout << (col -1) * (col -1) + row << endl;
        }
    }
   return 0;
}