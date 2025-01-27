/*
    A Gray code is a list of all 2^n bit strings of length n, where any two successive strings differ in exactly one bit (i.e., their Hamming distance is one).
    Your task is to create a Gray code for a given length n.
    Input
    The only input line has an integer n.
    Output
    Print 2^n lines that describe the Gray code. You can print any valid solution.
    Constraints

    1 <= n <= 16

    Example
    Input:
    2

    Output:
    00
    01
    11
    10
*/

/*
Solution:
Gray code(i) = i ^ (i / 2)
*/

//Some optimization stuff
#pragma GCC optimize("O3,no-stack-protector,unroll-loops,fast-math")
#pragma GCC target("avx,avx2,fma")

#include<iostream>
#include<bitset>

using namespace std;
int main() {
    cin.tie(nullptr)->sync_with_stdio(false);
    int n;
    cin >> n;
    // Loop through all numbers from 0 to 2^n - 1
    for (int i = 0; i < (1 << n); i++) {
        // Gray code formula: i ^ (i >> 1)
        int gray = i ^ (i >> 1);
        
        // Convert the number to binary and print it with leading zeros
        string binary = bitset<16>(gray).to_string(); // Convert to 32-bit binary
        cout << binary.substr(16 - n) << endl; // Extract the last n bits
    }
}