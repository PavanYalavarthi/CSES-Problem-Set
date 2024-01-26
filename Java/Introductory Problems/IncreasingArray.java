/*
Problem Statement:
    You are given an array of n integers. You want to modify the array so that
    it is increasing, i.e., every element is at least as large as the previous element.
    On each move, you may increase the value of any element by one. What is
    the minimum number of moves required?\

    Input
    The first input line contains an integer n: the size of the array.
    Then, the second line contains n integers x1, x2, . . . , xn : thecontentsof thearray.

    Output
    Print the minimum number of moves.

    Constraints
    1 ≤ n ≤ 2 · 10^5
    1 ≤ xi ≤ 10^9

    Example
    Input:
    5
    3 2 5 1 7
    Output:
    5

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class IncreasingArray {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextLong();
        long element, maxi = 0, ans = 0;;
        for(long i = 0; i< n; i++){
            element = sc.nextInt();
            if ( element >= maxi ) maxi = element;
            else ans += (maxi - element);
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