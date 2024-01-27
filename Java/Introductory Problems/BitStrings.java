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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class BitStrings {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        int MOD = 1000000007;
        long n = sc.nextLong();
        long a = 2, ans = 1;
        while (n > 0) {
            if (n % 2 == 1) ans = (ans * a) % MOD;
            a = (a * a) % MOD;
            n >>= 1;
        }
        out.print(ans);
        out.close();
    }
}

// For fast I/O : https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble() { return Double.parseDouble(next()); }

    String nextLine()
    {
        String str = "";
        try {
            if(st.hasMoreTokens()){
                str = st.nextToken("\n");
            }
            else{
                str = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}