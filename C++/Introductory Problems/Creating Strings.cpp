/*
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
*/

/*
Solution:
    sort the string to get least alphabetic string and use next_permutation to get the next permutation
*/

//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#include<iostream>
#include<algorithm>

using namespace std;

int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    string s;
    cin >> s;
    sort(s.begin(), s.end());
    vector<string> result;
    result.push_back(s);
    while(next_permutation(s.begin(), s.end())) {
        result.push_back(s);
    }
    cout << result.size() << '\n';
    for(string res : result) {
        cout << res << '\n';
    }
    return 0;
}