/*
Problem Statement:
    You have two coin piles containing a and b coins. On each move, you can either remove one coin from the left pile and 
    two coins from the right pile, or two coins from the left pile and one coin from the right pile.
    
    Your task is to efficiently find out if you can empty both the piles.
    
    Input
    The first input line has an integer t: the number of tests.
    After this, there are t lines, each of which has two integers a and b: the numbers of coins in the piles.
    Output
    For each test, print "YES" if you can empty the piles and "NO" otherwise.
    Constraints
    
    1 <= t <= 10^5
    0 <= a, b <= 10^9
    
    Example
    Input:
    3
    2 1
    2 2
    3 3
    
    Output:
    YES
    NO
    YES
*/

/*
Solution:
   As, in every instance we are removing 3 coins, total coins needed to be a multiple of 3

   Next if coins in one pile is more than the twice of the coins in another pile, we cant remove them

   Else, we can remove always remove them [(By taking 2 from bigger pile and 1 from smaller pile) or (2 coins and 1 coin alternatively from the pile if equaled)]
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class CoinPiles {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        int MOD = 1000000007;
        long t = sc.nextLong();
        long a, b;
        while (t-- > 0) {
            a = sc.nextLong();;
            b = sc.nextLong();;
            if ((a + b) % 3 != 0 || a > 2 * b || b > 2 * a)
                out.print("NO\n");
            else
                out.print("YES\n");
        }
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