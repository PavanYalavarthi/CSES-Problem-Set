/*
Problem Statement:
    Your task is to count for k=1,2,. . . ,n the number of ways two knights can be
    placed on a k ×k chess board so that they do not attack each other.
    Input:
        The only input line contains an integer n.
    Output :
        Print n integers: the results.
    Constraints :
        1 <= n <= 10000
    Example:
        Input: 8
    Output: 
        0 
        6 
        28 
        96 
        252 
        550 
        1056 
        1848
*/

/*
Solution:
    considering board is i x i
    Total possibilities :
        First knight can go in any of the i^2 squares and second can be in i^2 -1; 
        So, total possiblities  = i^2 * ( i^2 -1) / 2 [combinations]
    Possibilities of attacking:
        Total number of 3 x 2 squares in chess board : (i-1) * (i-2) [Horizontally] + (i-1) * (i-2) [Vertically] = 2 * (i-1) * i-2)
        Attacking positions are 2 [Placing at the corners]
        So, number of attacking positions = 2 * 2 * (i-1) * (i-2)
    Number of non attacking  = total - attacking positions
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class TwoKnights {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextLong();
        for(long i  = 1; i <= n;i++) {
            long s = i * i;
            out.println(s * (s-1) / 2 - 4 * (i-1) * (i-2));
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