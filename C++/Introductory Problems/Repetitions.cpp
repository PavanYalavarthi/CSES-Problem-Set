/*
Problem Statement:
    You are given a DNA sequence: a string consisting of characters A, C, G,
    and T. Your task is to find the longest repetition in the sequence. This is a
    maximum-length substring containing only one type of character. Input The
    only input line contains a string of n characters. Output Print one integer: the
    length of the longest repetition. Constraints
    1 ≤ n ≤ 106
    Example Input: ATTCGGGA
    Output: 3
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
    string s;
    cin >> s;
    int maxi = 1;
    char curr_char = s[0];
    for(int i = 1, curr_count = 1; i< s.length(); i++) {
        //loop till different character pops up
        while(curr_char == s[i]) i++, curr_count++;
        maxi = max(maxi, curr_count);
        curr_count = 1;
        curr_char = s[i];
    }
    cout << maxi;
    return 0;
}