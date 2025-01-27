/*
Problem Statement:
    Given a string, your task is to reorder its letters in such a way that it becomes a palindrome (i.e., it reads the same forwards and backwards).
    
    Input
    The only input line has a string of length n consisting of characters A–Z.
    Output
    Print a palindrome consisting of the characters of the original string. You may print any valid solution. If there are no solutions, print "NO SOLUTION".
    Constraints
    
    1 <= n <= 10^6
    
    Example
    Input:
    AAAACACBA
    
    Output:
    AACABACAA
*/

/*
Solution:
   we needed to get count of every alphabet in the string. 
   
   As we needed palindrome, maximum permissable odd count chanracter is one, where can we place that in middle

   remaining we keep placing at the extremes
*/

//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#define ll long long int
int MOD = 1000000007;

#include<iostream>
#include<vector>

using namespace std;
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    string s;
    vector<int> freq(26, 0);
    cin >> s;
    int n = s.size();
    for(int i=0; i< n; i++) freq[s[i] - 'A']++;
    char oddCharacter = '\0';
    int j = 0;
    for(int i = 0 ; i<26; i++) {
        if (freq[i] & 1) {
            if (oddCharacter != '\0') {
                cout << "NO SOLUTION";
                return 0;
            }
            oddCharacter = 'A' + i;
        }
        for( int k = 0; k < freq[i] >> 1; k++) {
            s[j] = s[n - j - 1] = 'A' + i;
            j++;
        }
    }
    if (oddCharacter) {
        s[n/2] = oddCharacter;
    }
    cout << s;
}